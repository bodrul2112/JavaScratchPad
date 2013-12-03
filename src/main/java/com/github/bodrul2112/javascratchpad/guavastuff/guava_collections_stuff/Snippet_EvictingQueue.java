package com.github.bodrul2112.javascratchpad.guavastuff.guava_collections_stuff;

import com.google.common.collect.EvictingQueue;

public class Snippet_EvictingQueue
{
	public static void main(String[] args)
	{
		EvictingQueue<String> evictingQueue = EvictingQueue.<String> create(10);
		
		for (int i = 0; i < 12; i++)
		{
			evictingQueue.add(i+"");
		}
		
		for (int i = 0; i < 12; i++)
		{
			System.out.println(i + " : " + evictingQueue.contains(i+""));
		}
		
		/** works like it says on the tin **/
		
	}
}
