package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceCPrettyImpl extends SubServiceCImpl
{
	@Override
	public String getName()
	{
		return "["+ super.getName() +"]";
	}
	
}
