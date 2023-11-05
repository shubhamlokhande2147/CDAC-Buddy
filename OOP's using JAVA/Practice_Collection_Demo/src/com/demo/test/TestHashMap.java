package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		//Map<String,Integer> hm = new HashMap<>();
		HashMap<Integer,String> hm = new HashMap<>();
		
		
		hm.put(1, "shubham");
		hm.put(2, "om");
		hm.put(3, "sid");
		hm.put(4, "shiv");
		hm.put(5, "vivek");
		hm.put(6, "vaibhav");
		hm.put(7 ,"abc");
		hm.put(7, "xyz"); //overwrite data on 7 

		
		System.out.println(hm.get(7));
	
		//display all key-pair
		Set<Integer> s = hm.keySet();
		for(Integer s1:s)
		{
			System.out.println("key : " + s1 + " value : " + hm.get(s1));
		}
		System.out.println("--------------------------------");

		
		//disp using map.entry
		Set<Map.Entry<Integer, String>> hset = hm.entrySet();
		for(Map.Entry<Integer, String> data : hset)
		{
			System.out.println("key : " + data.getKey() + " value : " + data.getValue());
		}
		
		System.out.println("--------------------------------");

		//display all key-pair with if condition
		Set<Integer> s2 = hm.keySet();
		for(Integer s1:s2)
		{ 
			if(hm.get(s1).equals("shiv") || hm.get(s1).equals("shubham"))
			System.out.println("key : " + s1 + " value : " + hm.get(s1));
		}
		System.out.println("--------------------------------");
		
		
		//containkey
		System.out.println("key 7 is present : " + hm.containsKey(7));
		System.out.println("key 10 is present : " + hm.containsKey(10));
	
	}

}
