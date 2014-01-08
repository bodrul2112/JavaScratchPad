package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceBImpl extends BaseSubService implements SubServiceB
{
	public SubServiceBImpl()
	{
		this("bob");
	}
	
	public SubServiceBImpl(String name)
	{
		super(name);
	}
	
	@Override
	public String getName()
	{
		return "B:"+super.getName();
	}
}
