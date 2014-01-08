package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceDAlternateImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceDDefaultImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class Module11_ScopesModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		bind(SubServiceDDefaultImpl.class).in(Singleton.class);
		bind(SubServiceDAlternateImpl.class).in(Singleton.class); // these should be lazy loaded if we define a  
//		bind(SubServiceCPrettyImpl.class).asEagerSingleton(); // They are always eager unless you set the Stage Enum
	}
}
