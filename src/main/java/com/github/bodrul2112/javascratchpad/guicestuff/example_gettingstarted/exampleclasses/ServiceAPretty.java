package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.PrettyB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations.PrettyC;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.google.inject.Inject;

public class ServiceAPretty
{
	private final SubServiceB b;
	private final SubServiceC c;
	
	@Inject
	ServiceAPretty(@PrettyB SubServiceB b, @PrettyC SubServiceC c)
	{
		this.b = b;
		this.c = c;
	}
	
	public void printServices()
	{
		System.out.println(b.getName() + ", " + c.getName());
	}
}
