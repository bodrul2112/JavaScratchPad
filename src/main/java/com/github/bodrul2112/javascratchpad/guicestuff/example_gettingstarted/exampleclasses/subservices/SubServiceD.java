package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.subservices;

import com.google.inject.ImplementedBy;

@ImplementedBy(SubServiceDDefaultImpl.class)
public interface SubServiceD
{
	public String getName();
}
