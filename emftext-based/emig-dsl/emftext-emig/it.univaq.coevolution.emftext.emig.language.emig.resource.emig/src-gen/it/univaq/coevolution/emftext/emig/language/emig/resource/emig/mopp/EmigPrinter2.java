/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigPrinter2 implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final PrintToken SPACE_TOKEN = new PrintToken(" ", null);
	private final PrintToken TAB_TOKEN = new PrintToken("\t", null);
	private final PrintToken NEW_LINE_TOKEN = new PrintToken(NEW_LINE, null);
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	protected java.util.List<PrintToken> tokenOutputStream;
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolverFactory tokenResolverFactory = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public EmigPrinter2(java.io.OutputStream outputStream, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement>  formattingElements = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(formattingElements, layoutInformations, eofLayoutInformation);
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_0, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_1, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Rule) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_2, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_3, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Package) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_4, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_5, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Class) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_6, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_7, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Attribute) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_8, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_9, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Reference) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_10, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.SetterDef) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_11, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.MParameter) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_12, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.RewritingRule) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_13, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_14, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_15, foundFormattingElements);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.emig.language.emig.Binding) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.EMIG_16, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Module) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_0, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Import) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_1, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclFeatureDefinition) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_2, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclContextDefinition) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_3, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclMetamodel) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_4, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclInstanceModel) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_5, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Attribute) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_7, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Operation) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_8, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Parameter) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_9, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclModelElementExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_10, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.LambdaCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_11, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.VariableExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_12, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SuperExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_13, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SelfExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_14, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.EnvExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_15, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.StringExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_16, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.BooleanExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_17, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.RealExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_18, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IntegerExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_19, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.BagExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_20, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OrderedSetExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_21, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SequenceExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_22, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SetExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_23, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.TupleExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_24, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.TuplePart) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_25, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.MapExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_26, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.MapElement) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_27, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.EnumLiteralExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_28, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclUndefinedExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_29, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.LetExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_30, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IfExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_31, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.BraceExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_32, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.EqOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_34, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.RelOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_35, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.AddOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_36, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IntOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_37, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.MulOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_38, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.NotOpCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_39, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.StaticPropertyCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_40, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.StaticOperationCall) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_41, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.StaticNavigationOrAttributeCall) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_42, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.PropertyCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_43, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.NavigationOrAttributeCall) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_45, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IterateExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_46, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IteratorExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_47, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.Iterator) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_48, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.CollectionOperationCall) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_49, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.StringType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_51, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.BooleanType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_52, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.IntegerType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_53, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.RealType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_54, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.BagType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_55, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OrderedSetType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_56, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SequenceType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_57, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.SetType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_58, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclAnyType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_59, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.TupleType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_61, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.TupleTypeAttribute) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_62, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclModelElement) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_63, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.MapType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_64, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.LambdaType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_65, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.EnvType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_66, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.LocalVariable) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_6, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OperatorCallExp) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_33, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OperationCall) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_44, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.CollectionType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_50, foundFormattingElements);
			return;
		}
		if (element instanceof be.ac.vub.simpleocl.OclType) {
			printInternal(element, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.SIMPLEOCL_60, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement ruleElement, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements) {
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator getDecoratorTree(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement syntaxElement) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator[] childDecorators = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decorator = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement syntaxElement = decorator.getDecoratedElement();
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal) {
				it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal terminal = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice) {
				// for choices we do print only the choice which does print at least one feature
				it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator childToPrint = null;
				for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.STAR || cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.ONE || cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal) {
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal terminal = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement printElement = decorator.getDecoratedElement();
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality = printElement.getCardinality();
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> cloned = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword) {
					printKeyword(eObject, (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder) {
					it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigContainment) {
					it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigContainment containment = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal) {
					it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal booleanTerminal = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal) {
					it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal enumTerminal = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigWhiteSpace) {
				foundFormattingElements.add((it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigWhiteSpace) printElement);
			}
			if (printElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigLineBreak) {
				foundFormattingElements.add((it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigLineBreak) printElement);
			}
			for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice) {
					break;
				}
			}
			if (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.ONE || cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.STAR || cardinality == it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword keyword, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
		}
	}
	
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal booleanTerminal, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printEnumerationTerminal(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal enumTerminal, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = enumTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof org.eclipse.emf.common.util.Enumerator;
			result = enumTerminal.getText(((org.eclipse.emf.common.util.Enumerator) attributeValue).getName());
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigContainment containment, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigWhiteSpace) {
					int amount = ((it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(SPACE_TOKEN);
					}
				}
				if (foundFormattingElement instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigLineBreak) {
					currentTabs = ((it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(NEW_LINE_TOKEN);
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(TAB_TOKEN);
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder, int count, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement> foundFormattingElements, java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = getValue(eObject, reference, count);
		// first add layout before the reference
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject eObjectToDeResolve = (org.eclipse.emf.ecore.EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((org.eclipse.emf.ecore.InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				if (deresolvedReference != null && deresolvedReference.startsWith(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")			
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		}
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<String, Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource getResource() {
		return resource;
	}
	
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigReferenceResolverSwitch getReferenceResolverSwitch() {
		return (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigReferenceResolverSwitch) new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigProblem(errorMessage, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType.PRINT_PROBLEM, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity.WARNING), cause);
	}
	
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter) {
				return (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter) adapter;
			}
		}
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter newAdapter = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation getLayoutInformation(java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> getCopyOfLayoutInformation(org.eclipse.emf.ecore.EObject eObject) {
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation> layoutInformations = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextScanner scanner = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken> tempTokens = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken>();
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
