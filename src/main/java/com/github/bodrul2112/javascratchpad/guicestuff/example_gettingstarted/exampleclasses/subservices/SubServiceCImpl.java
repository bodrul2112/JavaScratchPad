package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceCImpl extends BaseSubService implements SubServiceC
{
	public SubServiceCImpl()
	{
		this("cob");
	}
	
	public SubServiceCImpl(String name)
	{
		super(name);
	}
	
	@Override
	public String getName()
	{
		return "C:"+super.getName();
	}
}
