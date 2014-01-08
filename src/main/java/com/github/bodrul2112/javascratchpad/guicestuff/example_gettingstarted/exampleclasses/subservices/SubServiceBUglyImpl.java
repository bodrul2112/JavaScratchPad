package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceBUglyImpl extends SubServiceBImpl
{
	@Override
	public String getName()
	{
		return ">>>>"+ super.getName() +"<<<<";
	}
	
}
