package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceBUnboundImpl extends BaseSubService implements SubServiceB
{
	
	public SubServiceBUnboundImpl(NameImpl name)
	{
		this(name.getName());
	}
	
	public SubServiceBUnboundImpl(String name)
	{
		super(name);
	}
	
	@Override
	public String getName()
	{
		return "B:"+super.getName();
	}
}
