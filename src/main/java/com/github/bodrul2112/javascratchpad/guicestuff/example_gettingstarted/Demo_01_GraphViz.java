package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.modules.Module01_SimpleModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;

public class Demo_01_GraphViz
{
	public static void main(String[] args)
	{

		
		try{
			
			Injector demoInjector = Guice.createInjector(new Module01_SimpleModule());
			
			// The following breaks and gives us a pretty crap stack trace, but at least we know the binding problem is in the line below
			// ServiceA serviceA = injector.getInstance(ServiceA.class);
			// serviceA.printServices();
			
//			ServiceAPretty serviceAPretty = demoInjector.getInstance(ServiceAPretty.class);
//			System.out.println("pretty/pretty: ");
//			serviceAPretty.printServices();
//			
//			ServiceAUgly serviceAUgly = demoInjector.getInstance(ServiceAUgly.class);
//			System.out.println("ugly/ugly: ");
//			serviceAUgly.printServices();
//			
//			ServiceAUglyAndPretty serviceAUglyPretty = demoInjector.getInstance(ServiceAUglyAndPretty.class);
//			System.out.println("ugly/pretty: ");
//			serviceAUglyPretty.printServices();
			
			graph("test5.dot", demoInjector);
			
			
//			File f =  new File("testing.dot");
//			PrintWriter out = new PrintWriter(f, "UTF-8");
////		    PrintWriter out = new PrintWriter(f);
//
//		    Injector injector = Guice.createInjector(new GrapherModule(), new GraphvizModule());
//		    GraphvizRenderer renderer = injector.getInstance(GraphvizRenderer.class);
//		    renderer.setOut(out).setRankdir("TB");
//
//		    injector.getInstance(InjectorGrapher.class)
//		        .of(demoInjector)
//		        .graph();
//		    
//		    System.out.println("file at: " + f);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	private static void graph(String filename, Injector demoInjector) throws IOException {
	    PrintWriter out = new PrintWriter(new File(filename), "UTF-8");

	    Injector injector = Guice.createInjector(new GraphvizModule());
	    GraphvizGrapher grapher = injector.getInstance(GraphvizGrapher.class);
	    grapher.setOut(out);
	    grapher.setRankdir("TB");
	    grapher.graph(demoInjector);
	  }
	
//	    public static void graph4(String filename, Injector inj) throws Exception {
//	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//	        PrintWriter out = new PrintWriter(baos);
//
//	        Injector injector = Guice.createInjector(new GraphvizModule());
//	        GraphvizGrapher renderer = injector.getInstance(GraphvizGrapher.class);
//	        renderer.setOut(out);
//	        renderer.setRankdir("TB");
//	        renderer.graph(inj);  
//	        
//	        out = new PrintWriter(new File(filename), "UTF-8");
//	        String s = baos.toString("UTF-8");
//	        s = fixGrapherBug(s);
//	        s = hideClassPaths(s);
//	        out.write(s);
//	        out.close();
//	    }
//
//	    public static String hideClassPaths(String s) {
//	        s = s.replaceAll("\\w[a-z\\d_\\.]+\\.([A-Z][A-Za-z\\d_]*)", "");
//	        s = s.replaceAll("value=[\\w-]+", "random");
//	        return s;
//	    }
//
//	    public static String fixGrapherBug(String s) {
//	        s = s.replaceAll("style=invis", "style=solid");
//	        s = s.replaceAll(" margin=(\\S+), ", " margin=\"$1\", ");
//	        return s;
//	    }
	
}
