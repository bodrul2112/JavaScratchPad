package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceA;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module01_SimpleModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex01_SimpleBindings
{
	public static void main(String[] args)
	{
		// Tell guice what configurations you want to load
		Injector injector = Guice.createInjector(new Module01_SimpleModule());
		
		// Create stuff with your configuration, guice will create the constructor arg objects
		ServiceA serviceA = injector.getInstance(ServiceA.class);
		serviceA.printServices();
		
		// it's always a new object with the ServiceModule config
		ServiceA secondServiceA = injector.getInstance(ServiceA.class);
		secondServiceA.printServices();
		
	}
}
