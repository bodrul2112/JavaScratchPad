package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class Module06_ProvidesAnnotations extends AbstractModule
{
	@Override
	protected void configure() {}

	@Provides
	SubServiceB provideSubServiceB() 
	{
		/** Usually these are objects that require one to do a bit of wiring. 
		 I get the feeling that you could either choose to remove factories and do the wiring here
		 Or somehow nest the factory in a provides, that way you still have the factory abstracting away
		 the nitty gritty, and your configuration still looks clean
		*/
		
		// I just found out about provider bindings, so I might take all the above back
		
		SubServiceB subServiceB = new SubServiceBImpl();
		return subServiceB;
	}
	
	@Provides @Singleton
	SubServiceC provideSubServiceC()
	{
		SubServiceC subServiceC = new SubServiceCImpl();
		return subServiceC;
	}
}
