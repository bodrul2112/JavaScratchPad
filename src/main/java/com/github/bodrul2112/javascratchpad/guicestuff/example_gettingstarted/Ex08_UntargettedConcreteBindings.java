package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.exampleclasses.ServiceAConcrete;
import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module08_UntargettedConcreteBindings;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Ex08_UntargettedConcreteBindings
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new Module08_UntargettedConcreteBindings());
		
		ServiceAConcrete serviceA1 = injector.getInstance(ServiceAConcrete.class);
		serviceA1.printServices();
		
		ServiceAConcrete serviceA2 = injector.getInstance(ServiceAConcrete.class);
		serviceA2.printServices();
		
		ServiceAConcrete serviceA3 = injector.getInstance(ServiceAConcrete.class);
		serviceA3.printServices();
	}
}
