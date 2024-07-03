package org.java;

public class Day3_Employee extends Day3{
   public Day3_Employee() {
	   this("chennai-93",2564);
	   System.out.println("my name is sam");
   }
   public Day3_Employee(String address,int id) {
	   this(90.5f);
	   System.out.println("my address is:"+address+"\n"+"my id is:"+id);
   }
   
public Day3_Employee(float per) {
	super();
	System.out.println("percentage is:"+per);
	
}


public static void main(String[] args) {
	Day3_Employee e= new Day3_Employee();
	
}








}
