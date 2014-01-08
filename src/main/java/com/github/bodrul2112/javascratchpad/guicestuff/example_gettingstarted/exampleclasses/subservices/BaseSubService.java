package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

public class BaseSubService
{
	private static int generationNumber = 0;
	private String name;
	
	public BaseSubService(String name)
	{
		generationNumber++;
		this.name = generationNumber + name;
	}
	
	public String getName()
	{
		return name;
	}
}
