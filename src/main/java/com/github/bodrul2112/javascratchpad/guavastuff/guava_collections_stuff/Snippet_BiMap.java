package com.github.bodrul2112.javascratchpad.guavastuff.guava_collections_stuff;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;

public class Snippet_BiMap
{
	public static void main(String[] args)
	{
		BiMap<String, Integer> strToNum = HashBiMap.<String, Integer>create();
		
		strToNum.put("a",1);
		strToNum.put("b",2);
		strToNum.put("c",3);
		strToNum.put("d",4);
//		strToNum.put("double d",4);
		strToNum.put("e",5);
		strToNum.put("f",6);
		
		String strForNum = strToNum.inverse().get(4);
		
		System.out.println(strForNum);
		
		/** Don't like that it throws an exception, means anyone using this has to write some handling code here
		  	eg. use the .containsValue() method before adding something in.  
		 **/
		// And for sync:
		BiMap<String, Integer> synchronizedBimap = Maps.synchronizedBiMap(strToNum);
		BiMap<String, Integer> unmodBimap = Maps.unmodifiableBiMap(strToNum);
	}
}
