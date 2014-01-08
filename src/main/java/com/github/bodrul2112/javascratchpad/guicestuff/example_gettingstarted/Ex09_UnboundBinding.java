package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAUnbound;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module09_UnboundModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

public class Ex09_UnboundBinding
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(Stage.DEVELOPMENT, new Module09_UnboundModule());
		
		// This actually works
		ServiceAUnbound serviceA1 = injector.getInstance(ServiceAUnbound.class);
		serviceA1.printServices();
	}
}
