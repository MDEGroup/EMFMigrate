/*
* generated by Xtext
*/
package it.univaq.coevolution.emfmigrate;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EmigUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return it.univaq.coevolution.emfmigrate.ui.internal.EmigActivator.getInstance().getInjector("it.univaq.coevolution.emfmigrate.Emig");
	}
	
}
