/*
 * generated by Xtext
 */
package it.univaq.coevolution.differences.edelta.scoping;

import java.util.ArrayList;
import java.util.List;

import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Model;
import it.univaq.coevolution.differences.edelta.eDeltaLang.setter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class EDeltaLangScopeProvider extends AbstractDeclarativeScopeProvider {
	public IScope scope_setter_metafeature(setter f, EReference r) {
		
		String type=f.eContainer().eClass().getName().substring(0, f.eContainer().eClass().getName().indexOf("Op"));
		
			List union=new ArrayList();
			EPackage p=EcorePackage.eINSTANCE;
			EClass  c=	(EClass) p.getEClassifier(type);
			for (EStructuralFeature feature : c.getEStructuralFeatures()) {
				
				union.add(feature);
			}
			addSupertypesSetters(union,c);
			
			return Scopes.scopeFor(union);
	}
	private void addSupertypesSetters(List union, EClass c) {
		// TODO Auto-generated method stub
		if(c.getESuperTypes().size()>0){
		for (EClass supertype : c.getESuperTypes()) {
			for (EStructuralFeature feature : supertype.getEStructuralFeatures()) {
				union.add(feature);
		}
			addSupertypesSetters(union, supertype);
		}
		}
	}
	
	public IScope scope_ChangeClass_ref(ChangeClass c, EReference r) {
		List union=new ArrayList();
		
		getEClasses(c.eContainer().eContainer(), union);
		return Scopes.scopeFor(union);
	}

	public IScope scope_EClassOperation_ref(EClassOperation c, EReference r) {
		List union=new ArrayList();


//		if(((EPackageOp)c.eContainer()).getRef()!=null){
//		List<EClassifier> list_Ex=((EPackageOp)c.eContainer()).getRef().getEClassifiers();
//		union.addAll(list_Ex);
//		}
//	
//		//EList<EClassifier> list_new=((EPackageOp)c.eContainer()).getNew().getEClassifiers();
//		EList<EClassOp> list_new=((EPackageOp)c.eContainer()).getClassOperations();
//		for (EClassOp cop : ((EPackageOp)c.eContainer()).getClassOperations()) {
//		union.add(cop.getVar());
//		}
		getEClasses(c.eContainer(), union);
		return Scopes.scopeFor(union);
		}
	
	
	
	public IScope scope_ChangeAttribute_refAttr(EAttributeOperation attr, EReference r) {
	List union=new ArrayList();

	getEAttributes(attr.eContainer(), union);
	
	return Scopes.scopeFor(union);
	
	
	}
	
	
	public IScope scope_ChangeReference_ref(EReferenceOperation ref, EReference r) {
		List union=new ArrayList();

		getEReferences(ref.eContainer(), union);
		
		return Scopes.scopeFor(union);
		
		
		}
	public IScope scope_DeleteReference_ref(EReferenceOperation ref, EReference r) {
		List union=new ArrayList();
		if(ref.eContainer() instanceof ComplexOperatorDef){
			getParameter(ref.eContainer(),union);
		}else{
			getEReferences(ref.eContainer(), union);
		}
	
		return Scopes.scopeFor(union);
		
		
		}
	
	
	
	///////////////////utility/////////////////////////////////////////
	public Model getRoot(EObject o){
		Model m;
		if(o instanceof Model){ 
			return (Model)o;
			}else{
			return getRoot(o.eContainer());	
				
			}
			
	}
	
	

	
	public List getEClasses(EObject o,List union){
		

		
		if((((EPackageOperation)o).getOp() instanceof ChangePackage) &&(((ChangePackage)((EPackageOperation)o).getOp()).getRef()!=null)){
				List<EClassifier> list_Ex=((ChangePackage)((EPackageOperation)o).getOp()).getRef().getEClassifiers();
				union.addAll(list_Ex);
				}	
			
			//EList<EClassOp> list_new=((EPackageOp)getRootPackage(o)).getClasses();
			
			for (EClassOperation cop : ((EPackageOperation)o).getClasses()) {
				
			union.add(cop.getVar());
			}
			return union;
			
		}
	
	
	public List getEAttributes(EObject container,List union){
		//test if is instanceof changed class
		if(((EClassOperation)container).getOp() instanceof ChangeClass){
		//if(((EClassOp)container).getChange_op()!=null){
			List<EAttribute> list_Ex=((ChangeClass)((EClassOperation)container).getOp()).getRef().getEAttributes();
			union.addAll(list_Ex);
			} 
			for (EAttributeOperation aop : ((EClassOperation)container).getAttributes()) {
				union.add(aop.getVar());
				}
			return union;
	}
	
	public List getEReferences(EObject container,List union){
		
		if(((EClassOperation)container).getOp() instanceof ChangeClass){
			List<EReference> list_Ex=((ChangeClass)((EClassOperation)container).getOp()).getRef().getEReferences();
			union.addAll(list_Ex);
			}
			
			//EList<EReferenceOp> list_new=((EClassOp)container).getEReferenceOperations();
			for (EReferenceOperation rop : ((EClassOperation)container).getReferences()) {
			union.add(rop.getVar());
			}
			return union;
		
	}
	private void getParameter(EObject eContainer, List union) {
		// TODO Auto-generated method stub
		ComplexOperatorDef complexDef=(ComplexOperatorDef) eContainer;
		union.addAll(complexDef.getParams());
	}
	public static <E> List<E> toList(Iterable<E> iterable) {
	    if(iterable instanceof List) {
	      return (List<E>) iterable;
	    }
	    ArrayList<E> list = new ArrayList<E>();
	    if(iterable != null) {
	      for(E e: iterable) {
	        list.add(e);
	      }
	    }
	    return list;
	  }


	public IScope scope_setter_valueRef(setter f, EReference r) {
		
		List union=new ArrayList();
		EObject typeToFilter=f.getMetafeature().getEType();

		
		IScope all = delegateGetScope(f, r);
		for (IEObjectDescription od: all.getAllElements()) {
			
			if(od.getEObjectOrProxy().eIsProxy()){
			
				union.add(EcoreUtil2.resolve(od.getEObjectOrProxy(), f));
			}else {
				union.add(od.getEObjectOrProxy());
				
			}
				
		}
		
		
		return Scopes.scopeFor(union);
	}
public IScope scope_ComplexOperator_args(ComplexOperator f, EReference r) {
		
		List union=new ArrayList();
		

		
		IScope all = delegateGetScope(f, r);
		for (IEObjectDescription od: all.getAllElements()) {
			
			if(od.getEObjectOrProxy().eIsProxy()){
			
				union.add(EcoreUtil2.resolve(od.getEObjectOrProxy(), f));
			}else {
				union.add(od.getEObjectOrProxy());
				
			}
				
		}
		
		
		return Scopes.scopeFor(union);
	}


}
