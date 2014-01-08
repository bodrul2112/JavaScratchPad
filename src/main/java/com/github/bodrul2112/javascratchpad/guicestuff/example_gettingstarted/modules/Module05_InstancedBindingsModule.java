package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCImpl;
import com.google.inject.AbstractModule;

public class Module05_InstancedBindingsModule extends AbstractModule
{
	private final SubServiceBImpl bImpl = new SubServiceBImpl();
	private final SubServiceCImpl cImpl = new SubServiceCImpl();
	
	@Override
	protected void configure()
	{
		// you don't want to create instances that are generally complicated and take time to set up right
		// here, as they will slow down the initial binding process,
		// instead have then in an @Provides method
		
		bind(SubServiceB.class).toInstance(bImpl);
		bind(SubServiceC.class).toInstance(cImpl);
	}
}
