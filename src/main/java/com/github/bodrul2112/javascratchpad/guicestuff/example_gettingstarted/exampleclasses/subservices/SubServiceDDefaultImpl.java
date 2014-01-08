package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

import com.google.inject.Singleton;

@Singleton
public class SubServiceDDefaultImpl implements SubServiceD
{
	private static int global_version_count = 1;
	private final int version;
	
	public SubServiceDDefaultImpl()
	{
		this.version = global_version_count++;
	}
	
	@Override
	public String getName()
	{
		return "~default_"+version+"~";
	}
	
}
