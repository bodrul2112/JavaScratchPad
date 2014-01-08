package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBUglyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCUglyImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Module04_NamedAnnotationsModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		// Don't like these
		
		bind(SubServiceB.class)
		.annotatedWith(Names.named("UglyB"))
		.to(SubServiceBUglyImpl.class);
		
		bind(SubServiceB.class)
		.annotatedWith(Names.named("PrettyB"))
		.to(SubServiceBPrettyImpl.class);
		
		bind(SubServiceC.class)
		.annotatedWith(Names.named("UglyC"))
		.to(SubServiceCUglyImpl.class);
		
		bind(SubServiceC.class)
		.annotatedWith(Names.named("PrettyC"))
		.to(SubServiceCPrettyImpl.class);
		
		
	}
}
