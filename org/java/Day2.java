package org.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day2 {
	public static void main(String[] args) {
		Map<String,Integer>m=new HashMap();
		m.put("Csk",16);
		m.put("RR",18);
		m.put("KKr",18);
	System.out.println("add all map values:"+"\n"+m);
	
	Integer integer = m.get("Csk");
	System.out.println(integer);
	boolean containsKey = m.containsKey("Csk");
	System.out.println(containsKey);
	boolean containsValue = m.containsValue(16);
	System.out.println(containsValue);
	
//	m.remove("KKr");
//	System.out.println(m);

       int size = m.size();
      System.out.println(size);

	Set<String> keySet = m.keySet();
	for(String key:m.keySet()) {
	System.out.println("key:"+key+",value:"+m.get(key));
	System.out.println("   ");
	}
	
	
	Set<Entry<String,Integer>> entrySet = m.entrySet();
	for(Entry<String, Integer> m1:entrySet) {
		System.out.println(m1);
		String key = m1.getKey();
		System.out.println("keys is:"+key);
		Integer value = m1.getValue();
		System.out.println("values is:"+value);
	}
	Collection<Integer> values = m.values();
	System.out.println(values);
	
	

	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
