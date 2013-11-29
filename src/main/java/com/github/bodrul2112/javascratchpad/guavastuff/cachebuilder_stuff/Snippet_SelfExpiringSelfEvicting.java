package com.github.bodrul2112.javascratchpad.guavastuff.cachebuilder_stuff;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/**
 * These are code snippets where I don't care about the class names
 * @author bodrula
 */
public class Snippet_SelfExpiringSelfEvicting
{
	
	static class Wrapper{
		
		public Wrapper()
		{
		}
		
		public void wrappedMethod()
		{
		}
	}
	
	public static void main(String[] args) throws ExecutionException
	{
		
		final Wrapper wrapper = new Wrapper();
		
		final Cache<String, Wrapper> cache = CacheBuilder.newBuilder()
				.maximumSize(10)
				.expireAfterAccess(5000, TimeUnit.MILLISECONDS)
				.removalListener(new RemovalListener<String, Wrapper>()
				{
					@Override
					public void onRemoval(RemovalNotification<String, Wrapper> notification)
					{
						System.out.println("removed " + notification.getKey() + " -> this should neve have happend");
					}
				})
				.build();
		
		int i=0;
		cache.put(i + " key", wrapper);
		cache.put(i + " key", wrapper); // Interestingly when you override keys you also get an onRemoval notification

		i++;
		for(;i<20;i++)
		{
			cache.put(i + " key", new Wrapper());
		}

		/**
		 * This feels somewhat like a poor mans evict queue
		 */
	}
	
}
