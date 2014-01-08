package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAPretty;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAUgly;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAUglyAndPretty;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module03_AnnotatedModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex03_BindingAnnotations
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module03_AnnotatedModule());
		
		// The following breaks and gives us a pretty crap stack trace, but at least we know the binding problem is in the line below
		// ServiceA serviceA = injector.getInstance(ServiceA.class);
		// serviceA.printServices();
		
		ServiceAPretty serviceAPretty = injector.getInstance(ServiceAPretty.class);
		System.out.println("pretty/pretty: ");
		serviceAPretty.printServices();
		
		ServiceAUgly serviceAUgly = injector.getInstance(ServiceAUgly.class);
		System.out.println("ugly/ugly: ");
		serviceAUgly.printServices();
		
		ServiceAUglyAndPretty serviceAUglyPretty = injector.getInstance(ServiceAUglyAndPretty.class);
		System.out.println("ugly/pretty: ");
		serviceAUglyPretty.printServices();
		
	}
}
