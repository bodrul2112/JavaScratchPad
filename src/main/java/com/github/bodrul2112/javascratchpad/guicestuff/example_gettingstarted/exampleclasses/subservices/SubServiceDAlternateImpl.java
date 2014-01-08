package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class SubServiceDAlternateImpl implements SubServiceD
{
	private static int global_version_count = 1;
	private final int version;
	
	
	public SubServiceDAlternateImpl()
	{
		this.version = global_version_count++;
		System.out.println("created a new sub service alt D");
	}
	
	@Override
	public String getName()
	{
		return "~default_"+version+"~";
	}
	
}