package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.Pretty;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.Ugly;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBUglyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCUglyImpl;
import com.google.inject.AbstractModule;

public class Module03_1_AnnotatedModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		// Same as previous one but is cleaner since it reuses the annotation
		
		bind(SubServiceC.class)
		.annotatedWith(Ugly.class)
		.to(SubServiceCUglyImpl.class);
		
		bind(SubServiceC.class)
		.annotatedWith(Pretty.class)
		.to(SubServiceCPrettyImpl.class);
		
		bind(SubServiceB.class)
		.annotatedWith(Ugly.class)
		.to(SubServiceBUglyImpl.class);
		
		bind(SubServiceB.class)
		.annotatedWith(Pretty.class)
		.to(SubServiceBPrettyImpl.class);
		
		
	}
}
