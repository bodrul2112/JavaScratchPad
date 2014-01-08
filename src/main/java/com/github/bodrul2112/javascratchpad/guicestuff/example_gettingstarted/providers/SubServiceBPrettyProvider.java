package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.providers;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBPrettyImpl;
import com.google.inject.Provider;

public class SubServiceBPrettyProvider implements Provider<SubServiceB>
{
	public SubServiceBPrettyProvider()
	{
		// Maybe you want to set up the thing below here, or create a dependency tree by using constructor injection here
		// Like a factory with a single get
	}
	
	@Override
	public SubServiceB get()
	{
		return new SubServiceBPrettyImpl();
	}
}
