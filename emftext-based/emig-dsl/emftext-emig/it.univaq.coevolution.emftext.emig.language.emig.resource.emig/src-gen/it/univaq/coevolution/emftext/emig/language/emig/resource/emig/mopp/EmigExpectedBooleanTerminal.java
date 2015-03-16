/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class EmigExpectedBooleanTerminal extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal booleanTerminal;
	
	public EmigExpectedBooleanTerminal(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof EmigExpectedBooleanTerminal) {
			return getFeature().equals(((EmigExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
