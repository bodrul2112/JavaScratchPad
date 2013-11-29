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
public class Snippet_SelfExpiringAfterCreation
{
	public static void main(String[] args) throws ExecutionException
	{
		
		final Cache<String, String> cache = CacheBuilder.newBuilder()
				.maximumSize(10)
				.expireAfterWrite(500, TimeUnit.MILLISECONDS)
				.removalListener(new RemovalListener<String, String>()
				{
					@Override
					public void onRemoval(RemovalNotification<String, String> notification)
					{
						System.out.println("removed " + notification.getKey() + " : " + notification.getValue());
					}
				})
				.build();
		
		cache.put("a key", "a val");
		
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		cache.cleanUp(); // This must be called, the CacheBuilder does not perform cleanup and evict values automatically.
		
	}
	
}
