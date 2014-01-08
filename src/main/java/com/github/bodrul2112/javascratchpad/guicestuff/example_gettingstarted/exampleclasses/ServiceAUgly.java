package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.UglyB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.UglyC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.google.inject.Inject;

public class ServiceAUgly
{
	private final SubServiceB b;
	private final SubServiceC c;
	
	@Inject
	ServiceAUgly(@UglyB SubServiceB b, @UglyC SubServiceC c)
	{
		this.b = b;
		this.c = c;
	}
	
	public void printServices()
	{
		System.out.println(b.getName() + ", " + c.getName());
	}
}
