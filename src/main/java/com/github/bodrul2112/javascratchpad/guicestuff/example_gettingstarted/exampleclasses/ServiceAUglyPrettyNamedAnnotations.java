package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ServiceAUglyPrettyNamedAnnotations
{
	private final SubServiceB b;
	private final SubServiceC c;
	
	@Inject
	ServiceAUglyPrettyNamedAnnotations(@Named("UglyB") SubServiceB b, @Named("PrettyC") SubServiceC c)
	{
		this.b = b;
		this.c = c;
	}
	
	public void printServices()
	{
		System.out.println(b.getName() + ", " + c.getName());
	}
}
