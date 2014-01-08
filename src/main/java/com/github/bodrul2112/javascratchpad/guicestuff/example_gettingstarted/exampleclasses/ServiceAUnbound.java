package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceB;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceBUnboundImpl;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices.SubServiceC;
import com.google.inject.Inject;

public class ServiceAUnbound
{
	private final SubServiceB b;
	private final SubServiceC c;
	private SubServiceBUnboundImpl unbound;
	
	@Inject
	ServiceAUnbound(SubServiceB b, SubServiceC c, SubServiceBUnboundImpl unbound)
	{
		this.b = b;
		this.c = c;
		this.unbound = unbound;
	}
	
	public void printServices()
	{
		System.out.println(b.getName() + ", " + c.getName() + ", " + unbound.getName());
	}
}
