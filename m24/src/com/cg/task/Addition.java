package com.cg.task;

public class Addition {

	 static int add(int a,int b, int c, int d ,int e) {
		
		 return a+b+c+d+e;		 		
}
		 public static void main(String []args) {
			 System.out.println("The Addition Of Two Numbers    "+Addition.add (10,20,0,0,0));
			 System.out.println("The Addition Of Three Numbers  "+Addition.add (10,20,30,0,0));
		     System.out.println("The Addition Of Four Numbers   "+Addition.add (10,20,30,40,0));
		     System.out.println("The Addition Of Five Numbers   "+Addition.add (10,20,30,40,50));
			}

}