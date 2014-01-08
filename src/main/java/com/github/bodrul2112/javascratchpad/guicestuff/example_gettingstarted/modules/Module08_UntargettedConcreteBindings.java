package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class Module08_UntargettedConcreteBindings extends AbstractModule
{

	@Override
	protected void configure()
	{
		bind(SubServiceBPrettyImpl.class);
		bind(SubServiceCPrettyImpl.class).in(Singleton.class); // Tell concrete class to be singleton
		bind(SubServiceCPrettyImpl.class).asEagerSingleton(); // They are always eager unless you set the Stage Enum
		
		
		// in(Singleton.class) is pretty usefull, since you can bind(interface).to(concrete).in(singleton) 
		// don't need an extra provides method, or provides class to set up an initial object, just one line. 
	}

}
