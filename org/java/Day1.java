package org.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day1 {
	public static void main(String[] args) {
		
		List l= new ArrayList();
		l.add("apple");
		l.add("orange");
		l.add("grape");
		l.add("apple");
		System.out.println(" \n "+l);
		
		  Set s = new HashSet();
    s.add("12");
    s.add("50");
    s.add("70");
    
   System.out.println("adding all hashset values:");
  s.add("789");
  for(Object m:s) {
	  System.out.println(m);
  }
  int size = s.size();
  System.out.println(size);
	
	boolean addAll = s.addAll(l);
	System.out.println(addAll);
	for(Object o:s) {
		System.out.println(o);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}