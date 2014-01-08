package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.NameImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBUnboundImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceCPrettyImpl;
import com.google.inject.AbstractModule;

public class Module09_UnboundModule extends AbstractModule
{

	@Override
	protected void configure()
	{
		try
		{
			bind(SubServiceB.class).toConstructor(SubServiceBUnboundImpl.class.getConstructor(NameImpl.class));
			bind(SubServiceC.class).to(SubServiceCPrettyImpl.class);
			
			// this is pretty lol
			bind(SubServiceBUnboundImpl.class).toConstructor(SubServiceBUnboundImpl.class.getConstructor(NameImpl.class));
			
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
	}

}
