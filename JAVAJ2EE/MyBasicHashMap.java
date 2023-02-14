package com.stack;

import java.util.Map;
import java.util.TreeMap;

public class MyBasicHashMap {

	public static void main(String[] args) {
		{
	        Map<String, String> hm = new TreeMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("second", "SECOND INSERTED");
	        hm.put("first", "FIRST INSERTED");
	        
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        //getting value for the given key from hashmap
	        System.out.println("Value of second: "+hm.get("second"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        hm.remove("third");
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());
	    }
	}

	}


