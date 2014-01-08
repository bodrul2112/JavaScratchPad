package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceD;
import com.google.inject.Inject;

public class ServiceA_UsingD
{
	private SubServiceD d;

	@Inject
	ServiceA_UsingD(SubServiceD d)
	{
		this.d = d;
	}
	
	public void printServices()
	{
		System.out.println(d.getName());
	}
}
