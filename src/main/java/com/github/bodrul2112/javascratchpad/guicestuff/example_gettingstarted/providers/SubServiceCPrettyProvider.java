package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.providers;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.google.inject.Provider;

public class SubServiceCPrettyProvider implements Provider<SubServiceC>
{
	public SubServiceCPrettyProvider()
	{
		// Maybe you want to set up the thing below here, or create a dependency tree by using constructor injection here
	}
	
	// @Singleton wont work here
	@Override 
	public SubServiceC get()
	{
		return new SubServiceCPrettyImpl();
	}
}

