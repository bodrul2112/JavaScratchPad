package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module05_InstancedBindingsModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex05_InstanceBindings
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module05_InstancedBindingsModule());
		
		ServiceA serviceA = injector.getInstance(ServiceA.class);
		serviceA.printServices();

		ServiceA serviceA2 = injector.getInstance(ServiceA.class);
		serviceA2.printServices();
		
		ServiceA serviceA3 = injector.getInstance(ServiceA.class);
		serviceA3.printServices();
		
		// same instance every single time, the counter doesn't go up
	}
}
