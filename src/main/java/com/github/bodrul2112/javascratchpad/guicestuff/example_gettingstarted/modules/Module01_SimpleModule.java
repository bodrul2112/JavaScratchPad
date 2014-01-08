package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCImpl;
import com.google.inject.AbstractModule;

public class Module01_SimpleModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		// bind an interface with implementations
		
		bind(SubServiceB.class).to(SubServiceBImpl.class);
		bind(SubServiceC.class).to(SubServiceCImpl.class);
	}

}
