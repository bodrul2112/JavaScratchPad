package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module06_ProvidesAnnotations;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex06_ProvidesAnnotations
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module06_ProvidesAnnotations());
		
		// Set up my module to provide a new instance every time
		
		ServiceA serviceA = injector.getInstance(ServiceA.class);
		serviceA.printServices();

		ServiceA serviceA2 = injector.getInstance(ServiceA.class);
		serviceA2.printServices();
		
		ServiceA serviceA3 = injector.getInstance(ServiceA.class);
		serviceA3.printServices();
		
	}
}
