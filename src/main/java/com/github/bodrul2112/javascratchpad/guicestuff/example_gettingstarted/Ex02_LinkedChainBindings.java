package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module02_LinkedModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex02_LinkedChainBindings
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module02_LinkedModule());

		// SubServiceC is now linked to CPretty (output surrounded by square brackets)
		
		ServiceA serviceA = injector.getInstance(ServiceA.class);
		serviceA.printServices();
	}
}
