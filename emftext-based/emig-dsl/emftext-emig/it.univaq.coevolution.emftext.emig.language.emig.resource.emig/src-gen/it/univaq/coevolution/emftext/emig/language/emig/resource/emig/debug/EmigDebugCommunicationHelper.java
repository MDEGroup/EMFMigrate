/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

public class EmigDebugCommunicationHelper {
	
	public void sendEvent(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage sendAndReceive(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage receivedMessage = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
