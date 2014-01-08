package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAPrettyMulti;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module03_1_AnnotatedModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex03_1_BindingAnnotations
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module03_1_AnnotatedModule());
		
		ServiceAPrettyMulti service = injector.getInstance(ServiceAPrettyMulti.class);
		System.out.println("pretty/pretty: ");
		service.printServices();
	}
}
