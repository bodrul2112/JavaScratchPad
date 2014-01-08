package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.Pretty;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.google.inject.Inject;

public class ServiceAPrettyMulti
{
	private final SubServiceB b;
	private final SubServiceC c;
	
	@Inject 
	ServiceAPrettyMulti(@Pretty SubServiceB b, @Pretty SubServiceC c)
	{
		this.b = b;
		this.c = c;
	}
	
	public void printServices()
	{
		System.out.println(b.getName() + ", " + c.getName());
	}
}
