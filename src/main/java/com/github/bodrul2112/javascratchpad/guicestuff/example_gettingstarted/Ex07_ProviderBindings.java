package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module07_ProviderBindings;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex07_ProviderBindings
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module07_ProviderBindings());
		
		ServiceA serviceA = injector.getInstance(ServiceA.class);
		serviceA.printServices();

		ServiceA serviceA1 = injector.getInstance(ServiceA.class);
		serviceA1.printServices();
		
		ServiceA serviceA2 = injector.getInstance(ServiceA.class);
		serviceA2.printServices();
	}
}
