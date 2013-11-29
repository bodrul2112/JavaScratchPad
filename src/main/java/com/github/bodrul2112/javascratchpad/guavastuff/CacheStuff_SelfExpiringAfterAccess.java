package com.github.bodrul2112.javascratchpad.guavastuff;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/**
 * These are code snippets where I don't care about the class names
 * @author bodrula
 */
public class CacheStuff_SelfExpiringAfterAccess
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
				.expireAfterAccess(2000, TimeUnit.MILLISECONDS)
				.removalListener(new RemovalListener<String, Wrapper>()
				{
					@Override
					public void onRemoval(RemovalNotification<String, Wrapper> notification)
					{
						System.out.println("removed " + notification.getKey() + " -> this should neve have happend");
					}
				})
				.build();
		
		cache.put("a key", wrapper);
		
		Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable()
		{
			@Override
			public void run()
			{
				cache.getIfPresent("a key"); // here's us accessing the cached item
				/* wrapper.wrappedMethod(); this kind of thing doesn't count as access obvious */
				cache.cleanUp(); // This must be called, the CacheBuilder does not perform cleanup and evict values automatically.
				System.out.println("running");
			}
		}, 0, 1000, TimeUnit.MILLISECONDS);
		
	}
	
}
