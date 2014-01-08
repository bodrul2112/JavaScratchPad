package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.providers.SubServiceBPrettyProvider;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.providers.SubServiceCPrettyProvider;
import com.google.inject.AbstractModule;

public class Module07_ProviderBindings extends AbstractModule
{

	@Override
	protected void configure()
	{
		bind(SubServiceB.class).toProvider(SubServiceBPrettyProvider.class);
		bind(SubServiceC.class).toProvider(SubServiceCPrettyProvider.class);
	}

}
