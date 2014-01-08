package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.PrettyB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.PrettyC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.UglyB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.UglyC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBUglyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCUglyImpl;
import com.google.inject.AbstractModule;

public class Module03_AnnotatedModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		// Prefer annotations to named for larger projects, but as the code below demonstrates, it can be verbose to navigate
		// once you have quite a few of them with similar names (which lets face it they are since this is commonly used for
		// multiple implementations of the same interface) are together.
		
		bind(SubServiceC.class)
		.annotatedWith(UglyC.class)
		.to(SubServiceCUglyImpl.class);
		
		bind(SubServiceC.class)
		.annotatedWith(PrettyC.class)
		.to(SubServiceCPrettyImpl.class);
		
		bind(SubServiceB.class)
		.annotatedWith(UglyB.class)
		.to(SubServiceBUglyImpl.class);
		
		bind(SubServiceB.class)
		.annotatedWith(PrettyB.class)
		.to(SubServiceBPrettyImpl.class);
		
		
	}
}
