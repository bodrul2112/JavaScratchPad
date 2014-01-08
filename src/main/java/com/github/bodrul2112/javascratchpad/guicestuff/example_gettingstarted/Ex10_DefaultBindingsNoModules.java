package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA_UsingD;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex10_DefaultBindingsNoModules
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector();
		
		// This actually works
		// also demonstrates singleton annotation
		ServiceA_UsingD serviceA1 = injector.getInstance(ServiceA_UsingD.class);
		serviceA1.printServices();
		
		ServiceA_UsingD serviceA2 = injector.getInstance(ServiceA_UsingD.class);
		serviceA2.printServices();
		
		ServiceA_UsingD serviceA3 = injector.getInstance(ServiceA_UsingD.class);
		serviceA3.printServices();
	}
}
