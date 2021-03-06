/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class EmigDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugTarget debugTarget;
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugCommunicationHelper communicationHelper = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugCommunicationHelper();
	
	public EmigDebugProxy(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.EXIT);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage getStack() {
		return sendCommandAndRead(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage response = sendCommandAndRead(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage response = sendCommandAndRead(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugVariable[] variables  = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugVariable variable = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes command, String... parameters) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage sendCommandAndRead(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes command, String... parameters) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
