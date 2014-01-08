package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAUglyPrettyNamedAnnotations;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module04_NamedAnnotationsModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex04_NamedAnnotations
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module04_NamedAnnotationsModule());
		
		ServiceAUglyPrettyNamedAnnotations serviceA = injector.getInstance(ServiceAUglyPrettyNamedAnnotations.class);
		serviceA.printServices();
		
	}
}
