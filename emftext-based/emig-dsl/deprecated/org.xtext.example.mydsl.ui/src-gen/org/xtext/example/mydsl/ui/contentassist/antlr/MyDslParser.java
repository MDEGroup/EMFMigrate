/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMyModelAccess().getAlternatives(), "rule__MyModel__Alternatives");
					put(grammarAccess.getArtifactAccess().getTypeAlternatives_0(), "rule__Artifact__TypeAlternatives_0");
					put(grammarAccess.getOpDefAccess().getAlternatives(), "rule__OpDef__Alternatives");
					put(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_0(), "rule__EPackageOpDef__Alternatives_1_0");
					put(grammarAccess.getEPackageOpDefAccess().getAlternatives_1_8(), "rule__EPackageOpDef__Alternatives_1_8");
					put(grammarAccess.getEClassOpDefAccess().getAlternatives_1_0(), "rule__EClassOpDef__Alternatives_1_0");
					put(grammarAccess.getEClassOpDefAccess().getAlternatives_1_7_1(), "rule__EClassOpDef__Alternatives_1_7_1");
					put(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_0_0(), "rule__EAttributeOpDef__Alternatives_1_0_0");
					put(grammarAccess.getEAttributeOpDefAccess().getAlternatives_1_3(), "rule__EAttributeOpDef__Alternatives_1_3");
					put(grammarAccess.getEReferenceOpDefAccess().getAlternatives_1_0_0(), "rule__EReferenceOpDef__Alternatives_1_0_0");
					put(grammarAccess.getMigratorAccess().getAlternatives(), "rule__Migrator__Alternatives");
					put(grammarAccess.getMigratorDXAccess().getAlternatives(), "rule__MigratorDX__Alternatives");
					put(grammarAccess.getSpecificationCSAccess().getAlternatives(), "rule__SpecificationCS__Alternatives");
					put(grammarAccess.getStructuralFeatureAccess().getAlternatives(), "rule__StructuralFeature__Alternatives");
					put(grammarAccess.getIDAccess().getAlternatives(), "rule__ID__Alternatives");
					put(grammarAccess.getNUMBER_LITERALAccess().getAlternatives_2_0(), "rule__NUMBER_LITERAL__Alternatives_2_0");
					put(grammarAccess.getNUMBER_LITERALAccess().getAlternatives_2_1(), "rule__NUMBER_LITERAL__Alternatives_2_1");
					put(grammarAccess.getEssentialOCLReservedKeywordAccess().getAlternatives(), "rule__EssentialOCLReservedKeyword__Alternatives");
					put(grammarAccess.getEssentialOCLUnrestrictedIdentifierAccess().getAlternatives(), "rule__EssentialOCLUnrestrictedIdentifier__Alternatives");
					put(grammarAccess.getEssentialOCLPrefixOperatorAccess().getAlternatives(), "rule__EssentialOCLPrefixOperator__Alternatives");
					put(grammarAccess.getEssentialOCLInfixOperatorAccess().getAlternatives(), "rule__EssentialOCLInfixOperator__Alternatives");
					put(grammarAccess.getEssentialOCLNavigationOperatorAccess().getAlternatives(), "rule__EssentialOCLNavigationOperator__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getEssentialOCLUnreservedNameAccess().getAlternatives(), "rule__EssentialOCLUnreservedName__Alternatives");
					put(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives(), "rule__PrimitiveTypeIdentifier__Alternatives");
					put(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives(), "rule__CollectionTypeIdentifier__Alternatives");
					put(grammarAccess.getCollectionTypeCSAccess().getAlternatives_1(), "rule__CollectionTypeCS__Alternatives_1");
					put(grammarAccess.getTupleTypeCSAccess().getAlternatives_1(), "rule__TupleTypeCS__Alternatives_1");
					put(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives(), "rule__PrimitiveLiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives(), "rule__BooleanLiteralExpCS__Alternatives");
					put(grammarAccess.getTypeLiteralCSAccess().getAlternatives(), "rule__TypeLiteralCS__Alternatives");
					put(grammarAccess.getTypeNameExpCSAccess().getAlternatives(), "rule__TypeNameExpCS__Alternatives");
					put(grammarAccess.getTypeExpCSAccess().getAlternatives(), "rule__TypeExpCS__Alternatives");
					put(grammarAccess.getBinaryOperatorCSAccess().getAlternatives(), "rule__BinaryOperatorCS__Alternatives");
					put(grammarAccess.getPrefixedExpCSAccess().getAlternatives(), "rule__PrefixedExpCS__Alternatives");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives(), "rule__PrimaryExpCS__Alternatives");
					put(grammarAccess.getNameExpCSAccess().getAlternatives(), "rule__NameExpCS__Alternatives");
					put(grammarAccess.getMigrationLibraryAccess().getGroup(), "rule__MigrationLibrary__Group__0");
					put(grammarAccess.getMigrationProgramAccess().getGroup(), "rule__MigrationProgram__Group__0");
					put(grammarAccess.getMigrationProgramAccess().getGroup_0(), "rule__MigrationProgram__Group_0__0");
					put(grammarAccess.getMigrationProgramAccess().getGroup_5(), "rule__MigrationProgram__Group_5__0");
					put(grammarAccess.getMigrationProgramAccess().getGroup_5_1(), "rule__MigrationProgram__Group_5_1__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getEPackageOpDefAccess().getGroup(), "rule__EPackageOpDef__Group__0");
					put(grammarAccess.getEPackageOpDefAccess().getGroup_0(), "rule__EPackageOpDef__Group_0__0");
					put(grammarAccess.getEPackageOpDefAccess().getGroup_1(), "rule__EPackageOpDef__Group_1__0");
					put(grammarAccess.getEClassOpDefAccess().getGroup(), "rule__EClassOpDef__Group__0");
					put(grammarAccess.getEClassOpDefAccess().getGroup_0(), "rule__EClassOpDef__Group_0__0");
					put(grammarAccess.getEClassOpDefAccess().getGroup_1(), "rule__EClassOpDef__Group_1__0");
					put(grammarAccess.getEClassOpDefAccess().getGroup_1_7(), "rule__EClassOpDef__Group_1_7__0");
					put(grammarAccess.getEAttributeOpDefAccess().getGroup(), "rule__EAttributeOpDef__Group__0");
					put(grammarAccess.getEAttributeOpDefAccess().getGroup_0(), "rule__EAttributeOpDef__Group_0__0");
					put(grammarAccess.getEAttributeOpDefAccess().getGroup_1(), "rule__EAttributeOpDef__Group_1__0");
					put(grammarAccess.getEAttributeOpDefAccess().getGroup_1_0(), "rule__EAttributeOpDef__Group_1_0__0");
					put(grammarAccess.getEAttributeOpDefAccess().getGroup_1_3_0(), "rule__EAttributeOpDef__Group_1_3_0__0");
					put(grammarAccess.getEReferenceOpDefAccess().getGroup(), "rule__EReferenceOpDef__Group__0");
					put(grammarAccess.getEReferenceOpDefAccess().getGroup_0(), "rule__EReferenceOpDef__Group_0__0");
					put(grammarAccess.getEReferenceOpDefAccess().getGroup_1(), "rule__EReferenceOpDef__Group_1__0");
					put(grammarAccess.getEReferenceOpDefAccess().getGroup_1_0(), "rule__EReferenceOpDef__Group_1_0__0");
					put(grammarAccess.getEReferenceOpDefAccess().getGroup_1_3(), "rule__EReferenceOpDef__Group_1_3__0");
					put(grammarAccess.getSetterDefAccess().getGroup(), "rule__SetterDef__Group__0");
					put(grammarAccess.getSetterDefAccess().getGroup_4(), "rule__SetterDef__Group_4__0");
					put(grammarAccess.getRewritingRuleAccess().getGroup(), "rule__RewritingRule__Group__0");
					put(grammarAccess.getRewritingRuleAccess().getGroup_0(), "rule__RewritingRule__Group_0__0");
					put(grammarAccess.getRewritingRuleAccess().getGroup_1(), "rule__RewritingRule__Group_1__0");
					put(grammarAccess.getMigratorSXAccess().getGroup(), "rule__MigratorSX__Group__0");
					put(grammarAccess.getMigratorSXAccess().getGroup_7(), "rule__MigratorSX__Group_7__0");
					put(grammarAccess.getMigratorDXAccess().getGroup_0(), "rule__MigratorDX__Group_0__0");
					put(grammarAccess.getMigratorDXAccess().getGroup_0_1(), "rule__MigratorDX__Group_0_1__0");
					put(grammarAccess.getMigratorDXAccess().getGroup_0_1_5(), "rule__MigratorDX__Group_0_1_5__0");
					put(grammarAccess.getFilterMigratorAccess().getGroup(), "rule__FilterMigrator__Group__0");
					put(grammarAccess.getDotNavigationObjSXAccess().getGroup(), "rule__DotNavigationObjSX__Group__0");
					put(grammarAccess.getDotNavigationObjSXAccess().getGroup_2(), "rule__DotNavigationObjSX__Group_2__0");
					put(grammarAccess.getDotNavigationObjDXAccess().getGroup(), "rule__DotNavigationObjDX__Group__0");
					put(grammarAccess.getDotNavigationObjDXAccess().getGroup_2(), "rule__DotNavigationObjDX__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup(), "rule__NUMBER_LITERAL__Group__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup_1(), "rule__NUMBER_LITERAL__Group_1__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup_2(), "rule__NUMBER_LITERAL__Group_2__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup(), "rule__CollectionTypeCS__Group__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup_1_0(), "rule__CollectionTypeCS__Group_1_0__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup_1_1(), "rule__CollectionTypeCS__Group_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup(), "rule__TupleTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_0(), "rule__TupleTypeCS__Group_1_0__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_0_1(), "rule__TupleTypeCS__Group_1_0_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_0_1_1(), "rule__TupleTypeCS__Group_1_0_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1(), "rule__TupleTypeCS__Group_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1_1(), "rule__TupleTypeCS__Group_1_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1_1_1(), "rule__TupleTypeCS__Group_1_1_1_1__0");
					put(grammarAccess.getTuplePartCSAccess().getGroup(), "rule__TuplePartCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup(), "rule__CollectionLiteralExpCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2(), "rule__CollectionLiteralExpCS__Group_2__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1(), "rule__CollectionLiteralExpCS__Group_2_1__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup(), "rule__CollectionLiteralPartCS__Group__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1(), "rule__CollectionLiteralPartCS__Group_1__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup(), "rule__TupleLiteralExpCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3(), "rule__TupleLiteralExpCS__Group_3__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup(), "rule__TupleLiteralPartCS__Group__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1(), "rule__TupleLiteralPartCS__Group_1__0");
					put(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup(), "rule__UnlimitedNaturalLiteralExpCS__Group__0");
					put(grammarAccess.getInvalidLiteralExpCSAccess().getGroup(), "rule__InvalidLiteralExpCS__Group__0");
					put(grammarAccess.getNullLiteralExpCSAccess().getGroup(), "rule__NullLiteralExpCS__Group__0");
					put(grammarAccess.getTypeNameExpCSAccess().getGroup_0(), "rule__TypeNameExpCS__Group_0__0");
					put(grammarAccess.getTypeNameExpCSAccess().getGroup_0_0(), "rule__TypeNameExpCS__Group_0_0__0");
					put(grammarAccess.getTypeNameExpCSAccess().getGroup_0_0_2(), "rule__TypeNameExpCS__Group_0_0_2__0");
					put(grammarAccess.getInfixedExpCSAccess().getGroup(), "rule__InfixedExpCS__Group__0");
					put(grammarAccess.getInfixedExpCSAccess().getGroup_1(), "rule__InfixedExpCS__Group_1__0");
					put(grammarAccess.getInfixedExpCSAccess().getGroup_1_1(), "rule__InfixedExpCS__Group_1_1__0");
					put(grammarAccess.getPrefixedExpCSAccess().getGroup_1(), "rule__PrefixedExpCS__Group_1__0");
					put(grammarAccess.getNameExpCSAccess().getGroup_0(), "rule__NameExpCS__Group_0__0");
					put(grammarAccess.getNameExpCSAccess().getGroup_0_0(), "rule__NameExpCS__Group_0_0__0");
					put(grammarAccess.getNameExpCSAccess().getGroup_0_0_2(), "rule__NameExpCS__Group_0_0_2__0");
					put(grammarAccess.getIndexExpCSAccess().getGroup(), "rule__IndexExpCS__Group__0");
					put(grammarAccess.getIndexExpCSAccess().getGroup_1(), "rule__IndexExpCS__Group_1__0");
					put(grammarAccess.getIndexExpCSAccess().getGroup_1_3(), "rule__IndexExpCS__Group_1_3__0");
					put(grammarAccess.getIndexExpCSAccess().getGroup_1_5(), "rule__IndexExpCS__Group_1_5__0");
					put(grammarAccess.getIndexExpCSAccess().getGroup_1_5_2(), "rule__IndexExpCS__Group_1_5_2__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup(), "rule__NavigatingExpCS__Group__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1(), "rule__NavigatingExpCS__Group_1__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2(), "rule__NavigatingExpCS__Group_1_2__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_2(), "rule__NavigatingExpCS__Group_1_2_2__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_3(), "rule__NavigatingExpCS__Group_1_2_3__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup(), "rule__NavigatingArgCS__Group__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_1(), "rule__NavigatingArgCS__Group_1__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_2(), "rule__NavigatingArgCS__Group_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup(), "rule__NavigatingBarArgCS__Group__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2(), "rule__NavigatingBarArgCS__Group_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_3(), "rule__NavigatingBarArgCS__Group_3__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup(), "rule__NavigatingCommaArgCS__Group__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2(), "rule__NavigatingCommaArgCS__Group_2__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_3(), "rule__NavigatingCommaArgCS__Group_3__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup(), "rule__NavigatingSemiArgCS__Group__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2(), "rule__NavigatingSemiArgCS__Group_2__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_3(), "rule__NavigatingSemiArgCS__Group_3__0");
					put(grammarAccess.getIfExpCSAccess().getGroup(), "rule__IfExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup(), "rule__LetExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup_2(), "rule__LetExpCS__Group_2__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup(), "rule__LetVariableCS__Group__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup_1(), "rule__LetVariableCS__Group_1__0");
					put(grammarAccess.getNestedExpCSAccess().getGroup(), "rule__NestedExpCS__Group__0");
					put(grammarAccess.getSelfExpCSAccess().getGroup(), "rule__SelfExpCS__Group__0");
					put(grammarAccess.getMyModelAccess().getMigrationLibAssignment_0(), "rule__MyModel__MigrationLibAssignment_0");
					put(grammarAccess.getMyModelAccess().getMigrationProgrAssignment_1(), "rule__MyModel__MigrationProgrAssignment_1");
					put(grammarAccess.getMigrationLibraryAccess().getTitleAssignment_1(), "rule__MigrationLibrary__TitleAssignment_1");
					put(grammarAccess.getMigrationLibraryAccess().getRulesAssignment_3(), "rule__MigrationLibrary__RulesAssignment_3");
					put(grammarAccess.getMigrationProgramAccess().getLibsAssignment_0_1(), "rule__MigrationProgram__LibsAssignment_0_1");
					put(grammarAccess.getMigrationProgramAccess().getMigrAssignment_1(), "rule__MigrationProgram__MigrAssignment_1");
					put(grammarAccess.getMigrationProgramAccess().getTypeArtAssignment_2(), "rule__MigrationProgram__TypeArtAssignment_2");
					put(grammarAccess.getMigrationProgramAccess().getNameAssignment_3(), "rule__MigrationProgram__NameAssignment_3");
					put(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_0(), "rule__MigrationProgram__TransformationPackageAssignment_5_0");
					put(grammarAccess.getMigrationProgramAccess().getTransformationPackageAssignment_5_1_1(), "rule__MigrationProgram__TransformationPackageAssignment_5_1_1");
					put(grammarAccess.getMigrationProgramAccess().getDeltaAssignment_7(), "rule__MigrationProgram__DeltaAssignment_7");
					put(grammarAccess.getMigrationProgramAccess().getRulesAssignment_9(), "rule__MigrationProgram__RulesAssignment_9");
					put(grammarAccess.getArtifactAccess().getTypeAssignment(), "rule__Artifact__TypeAssignment");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getFilterAssignment_3(), "rule__Rule__FilterAssignment_3");
					put(grammarAccess.getRuleAccess().getRewritingRulesAssignment_6(), "rule__Rule__RewritingRulesAssignment_6");
					put(grammarAccess.getEPackageOpDefAccess().getVarAssignment_0_1(), "rule__EPackageOpDef__VarAssignment_0_1");
					put(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_0(), "rule__EPackageOpDef__OpAssignment_1_0_0");
					put(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_1(), "rule__EPackageOpDef__OpAssignment_1_0_1");
					put(grammarAccess.getEPackageOpDefAccess().getOpAssignment_1_0_2(), "rule__EPackageOpDef__OpAssignment_1_0_2");
					put(grammarAccess.getEPackageOpDefAccess().getRefAssignment_1_2(), "rule__EPackageOpDef__RefAssignment_1_2");
					put(grammarAccess.getEPackageOpDefAccess().getSettersAssignment_1_8_0(), "rule__EPackageOpDef__SettersAssignment_1_8_0");
					put(grammarAccess.getEPackageOpDefAccess().getClassesAssignment_1_8_1(), "rule__EPackageOpDef__ClassesAssignment_1_8_1");
					put(grammarAccess.getEClassOpDefAccess().getVarAssignment_0_1(), "rule__EClassOpDef__VarAssignment_0_1");
					put(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_0(), "rule__EClassOpDef__OpAssignment_1_0_0");
					put(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_1(), "rule__EClassOpDef__OpAssignment_1_0_1");
					put(grammarAccess.getEClassOpDefAccess().getOpAssignment_1_0_2(), "rule__EClassOpDef__OpAssignment_1_0_2");
					put(grammarAccess.getEClassOpDefAccess().getRefAssignment_1_2(), "rule__EClassOpDef__RefAssignment_1_2");
					put(grammarAccess.getEClassOpDefAccess().getSettersAssignment_1_7_1_0(), "rule__EClassOpDef__SettersAssignment_1_7_1_0");
					put(grammarAccess.getEClassOpDefAccess().getAttributesAssignment_1_7_1_1(), "rule__EClassOpDef__AttributesAssignment_1_7_1_1");
					put(grammarAccess.getEClassOpDefAccess().getReferencesAssignment_1_7_1_2(), "rule__EClassOpDef__ReferencesAssignment_1_7_1_2");
					put(grammarAccess.getEAttributeOpDefAccess().getVarAssignment_0_1(), "rule__EAttributeOpDef__VarAssignment_0_1");
					put(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_0(), "rule__EAttributeOpDef__OpAssignment_1_0_0_0");
					put(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_1(), "rule__EAttributeOpDef__OpAssignment_1_0_0_1");
					put(grammarAccess.getEAttributeOpDefAccess().getOpAssignment_1_0_0_2(), "rule__EAttributeOpDef__OpAssignment_1_0_0_2");
					put(grammarAccess.getEAttributeOpDefAccess().getRefAssignment_1_0_2(), "rule__EAttributeOpDef__RefAssignment_1_0_2");
					put(grammarAccess.getEAttributeOpDefAccess().getSettersAssignment_1_3_0_1(), "rule__EAttributeOpDef__SettersAssignment_1_3_0_1");
					put(grammarAccess.getEReferenceOpDefAccess().getVarAssignment_0_1(), "rule__EReferenceOpDef__VarAssignment_0_1");
					put(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_0(), "rule__EReferenceOpDef__OpAssignment_1_0_0_0");
					put(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_1(), "rule__EReferenceOpDef__OpAssignment_1_0_0_1");
					put(grammarAccess.getEReferenceOpDefAccess().getOpAssignment_1_0_0_2(), "rule__EReferenceOpDef__OpAssignment_1_0_0_2");
					put(grammarAccess.getEReferenceOpDefAccess().getRefAssignment_1_0_2(), "rule__EReferenceOpDef__RefAssignment_1_0_2");
					put(grammarAccess.getEReferenceOpDefAccess().getSettersAssignment_1_3_1(), "rule__EReferenceOpDef__SettersAssignment_1_3_1");
					put(grammarAccess.getSetterDefAccess().getMetafeatureAssignment_1(), "rule__SetterDef__MetafeatureAssignment_1");
					put(grammarAccess.getSetterDefAccess().getOperatorAssignment_2(), "rule__SetterDef__OperatorAssignment_2");
					put(grammarAccess.getSetterDefAccess().getParAssignment_3(), "rule__SetterDef__ParAssignment_3");
					put(grammarAccess.getSetterDefAccess().getParAssignment_4_1(), "rule__SetterDef__ParAssignment_4_1");
					put(grammarAccess.getRewritingRuleAccess().getMigratorsSXAssignment_0_0(), "rule__RewritingRule__MigratorsSXAssignment_0_0");
					put(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_0_2(), "rule__RewritingRule__MigratorDXAssignment_0_2");
					put(grammarAccess.getRewritingRuleAccess().getMigratorSXAssignment_1_1(), "rule__RewritingRule__MigratorSXAssignment_1_1");
					put(grammarAccess.getRewritingRuleAccess().getMigratorDXAssignment_1_3(), "rule__RewritingRule__MigratorDXAssignment_1_3");
					put(grammarAccess.getMigratorSXAccess().getNameAssignment_1(), "rule__MigratorSX__NameAssignment_1");
					put(grammarAccess.getMigratorSXAccess().getElementSXAssignment_3(), "rule__MigratorSX__ElementSXAssignment_3");
					put(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_6(), "rule__MigratorSX__FilterSXAssignment_6");
					put(grammarAccess.getMigratorSXAccess().getFilterSXAssignment_7_1(), "rule__MigratorSX__FilterSXAssignment_7_1");
					put(grammarAccess.getMigratorDXAccess().getNameAssignment_0_1_0(), "rule__MigratorDX__NameAssignment_0_1_0");
					put(grammarAccess.getMigratorDXAccess().getElementDXAssignment_0_1_2(), "rule__MigratorDX__ElementDXAssignment_0_1_2");
					put(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_4(), "rule__MigratorDX__FilterDXAssignment_0_1_4");
					put(grammarAccess.getMigratorDXAccess().getFilterDXAssignment_0_1_5_1(), "rule__MigratorDX__FilterDXAssignment_0_1_5_1");
					put(grammarAccess.getFilterMigratorAccess().getFeatureSXAssignment_0(), "rule__FilterMigrator__FeatureSXAssignment_0");
					put(grammarAccess.getFilterMigratorAccess().getOpAssignment_1(), "rule__FilterMigrator__OpAssignment_1");
					put(grammarAccess.getFilterMigratorAccess().getValueAssignment_2(), "rule__FilterMigrator__ValueAssignment_2");
					put(grammarAccess.getDotNavigationObjSXAccess().getObjAssignment_1(), "rule__DotNavigationObjSX__ObjAssignment_1");
					put(grammarAccess.getDotNavigationObjSXAccess().getRefAssignment_2_1(), "rule__DotNavigationObjSX__RefAssignment_2_1");
					put(grammarAccess.getDotNavigationObjDXAccess().getObjAssignment_1(), "rule__DotNavigationObjDX__ObjAssignment_1");
					put(grammarAccess.getDotNavigationObjDXAccess().getRefAssignment_2_1(), "rule__DotNavigationObjDX__RefAssignment_2_1");
					put(grammarAccess.getSpecificationCSAccess().getOwnedExpressionAssignment_0(), "rule__SpecificationCS__OwnedExpressionAssignment_0");
					put(grammarAccess.getSpecificationCSAccess().getExprStringAssignment_1(), "rule__SpecificationCS__ExprStringAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getReferenceAccess().getNameAssignment_1(), "rule__Reference__NameAssignment_1");
					put(grammarAccess.getModelAccess().getOwnedExpressionAssignment(), "rule__Model__OwnedExpressionAssignment");
					put(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment(), "rule__PrimitiveTypeCS__NameAssignment");
					put(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0(), "rule__CollectionTypeCS__NameAssignment_0");
					put(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_0_1(), "rule__CollectionTypeCS__OwnedTypeAssignment_1_0_1");
					put(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_1_1(), "rule__CollectionTypeCS__OwnedTypeAssignment_1_1_1");
					put(grammarAccess.getTupleTypeCSAccess().getNameAssignment_0(), "rule__TupleTypeCS__NameAssignment_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_0_1_0(), "rule__TupleTypeCS__OwnedPartsAssignment_1_0_1_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_0_1_1_1(), "rule__TupleTypeCS__OwnedPartsAssignment_1_0_1_1_1");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_1_0(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_1_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_1_1_1(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_1_1_1");
					put(grammarAccess.getTuplePartCSAccess().getNameAssignment_0(), "rule__TuplePartCS__NameAssignment_0");
					put(grammarAccess.getTuplePartCSAccess().getOwnedTypeAssignment_2(), "rule__TuplePartCS__OwnedTypeAssignment_2");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeAssignment_0(), "rule__CollectionLiteralExpCS__OwnedTypeAssignment_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_0(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_1_1(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0(), "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1(), "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_2(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_3_1(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0(), "rule__TupleLiteralPartCS__NameAssignment_0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeAssignment_1_1(), "rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3(), "rule__TupleLiteralPartCS__InitExpressionAssignment_3");
					put(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment(), "rule__NumberLiteralExpCS__NameAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment(), "rule__StringLiteralExpCS__NameAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0(), "rule__BooleanLiteralExpCS__NameAssignment_0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1(), "rule__BooleanLiteralExpCS__NameAssignment_1");
					put(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeAssignment(), "rule__TypeLiteralExpCS__OwnedTypeAssignment");
					put(grammarAccess.getTypeNameExpCSAccess().getNamespaceAssignment_0_0_0(), "rule__TypeNameExpCS__NamespaceAssignment_0_0_0");
					put(grammarAccess.getTypeNameExpCSAccess().getNamespaceAssignment_0_0_2_0(), "rule__TypeNameExpCS__NamespaceAssignment_0_0_2_0");
					put(grammarAccess.getTypeNameExpCSAccess().getElementAssignment_0_1(), "rule__TypeNameExpCS__ElementAssignment_0_1");
					put(grammarAccess.getTypeNameExpCSAccess().getElementAssignment_1(), "rule__TypeNameExpCS__ElementAssignment_1");
					put(grammarAccess.getInfixedExpCSAccess().getOwnedOperatorAssignment_1_1_0(), "rule__InfixedExpCS__OwnedOperatorAssignment_1_1_0");
					put(grammarAccess.getInfixedExpCSAccess().getOwnedExpressionAssignment_1_1_1(), "rule__InfixedExpCS__OwnedExpressionAssignment_1_1_1");
					put(grammarAccess.getInfixOperatorCSAccess().getNameAssignment(), "rule__InfixOperatorCS__NameAssignment");
					put(grammarAccess.getNavigationOperatorCSAccess().getNameAssignment(), "rule__NavigationOperatorCS__NameAssignment");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_1_1(), "rule__PrefixedExpCS__OwnedOperatorAssignment_1_1");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionAssignment_1_2(), "rule__PrefixedExpCS__OwnedExpressionAssignment_1_2");
					put(grammarAccess.getUnaryOperatorCSAccess().getNameAssignment(), "rule__UnaryOperatorCS__NameAssignment");
					put(grammarAccess.getNameExpCSAccess().getNamespaceAssignment_0_0_0(), "rule__NameExpCS__NamespaceAssignment_0_0_0");
					put(grammarAccess.getNameExpCSAccess().getNamespaceAssignment_0_0_2_0(), "rule__NameExpCS__NamespaceAssignment_0_0_2_0");
					put(grammarAccess.getNameExpCSAccess().getElementAssignment_0_1(), "rule__NameExpCS__ElementAssignment_0_1");
					put(grammarAccess.getNameExpCSAccess().getElementAssignment_1(), "rule__NameExpCS__ElementAssignment_1");
					put(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_2(), "rule__IndexExpCS__FirstIndexesAssignment_1_2");
					put(grammarAccess.getIndexExpCSAccess().getFirstIndexesAssignment_1_3_1(), "rule__IndexExpCS__FirstIndexesAssignment_1_3_1");
					put(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_1(), "rule__IndexExpCS__SecondIndexesAssignment_1_5_1");
					put(grammarAccess.getIndexExpCSAccess().getSecondIndexesAssignment_1_5_2_1(), "rule__IndexExpCS__SecondIndexesAssignment_1_5_2_1");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_0(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_0");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_1(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_1");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_0(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_0");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_2_1(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_2_1");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_0(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_0");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_2_3_1(), "rule__NavigatingExpCS__ArgumentAssignment_1_2_3_1");
					put(grammarAccess.getNavigatingArgCSAccess().getNameAssignment_0(), "rule__NavigatingArgCS__NameAssignment_0");
					put(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeAssignment_1_1(), "rule__NavigatingArgCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getNavigatingArgCSAccess().getInitAssignment_2_1(), "rule__NavigatingArgCS__InitAssignment_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingBarArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getNameAssignment_1(), "rule__NavigatingBarArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getInitAssignment_3_1(), "rule__NavigatingBarArgCS__InitAssignment_3_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingCommaArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getNameAssignment_1(), "rule__NavigatingCommaArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getInitAssignment_3_1(), "rule__NavigatingCommaArgCS__InitAssignment_3_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingSemiArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getNameAssignment_1(), "rule__NavigatingSemiArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getInitAssignment_3_1(), "rule__NavigatingSemiArgCS__InitAssignment_3_1");
					put(grammarAccess.getIfExpCSAccess().getConditionAssignment_1(), "rule__IfExpCS__ConditionAssignment_1");
					put(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3(), "rule__IfExpCS__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5(), "rule__IfExpCS__ElseExpressionAssignment_5");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_1(), "rule__LetExpCS__VariableAssignment_1");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1(), "rule__LetExpCS__VariableAssignment_2_1");
					put(grammarAccess.getLetExpCSAccess().getInAssignment_4(), "rule__LetExpCS__InAssignment_4");
					put(grammarAccess.getLetVariableCSAccess().getNameAssignment_0(), "rule__LetVariableCS__NameAssignment_0");
					put(grammarAccess.getLetVariableCSAccess().getOwnedTypeAssignment_1_1(), "rule__LetVariableCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_3(), "rule__LetVariableCS__InitExpressionAssignment_3");
					put(grammarAccess.getNestedExpCSAccess().getSourceAssignment_1(), "rule__NestedExpCS__SourceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleMyModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_DOCUMENTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
