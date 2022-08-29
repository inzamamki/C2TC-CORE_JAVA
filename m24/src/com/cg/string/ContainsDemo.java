package com.cg.string;

public class ContainsDemo {

	public static void main(String[] args) {
		String name="what do you know about me khan";  
		//The Java String class contains() method searches the sequence of characters
		//in this string. It returns true if the sequence of char values is found in this string otherwise returns false.
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("khan"));  
		System.out.println(name.contains("Inzamam")); 

	}

}

