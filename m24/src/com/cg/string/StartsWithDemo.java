package com.cg.string;

public class StartsWithDemo {

	public static void main(String[] args) {
		// input string  
		String s1="string split method of Java is  done by Khan Inzamam";  
		
		//The Java String class startsWith() method checks if this string starts with the 
		
		System.out.println(s1.startsWith("st"));  // true  
		System.out.println(s1.startsWith("St"));  // false
		System.out.println(s1.startsWith("string split"));   // true  
		System.out.println(s1.startsWith("String"));  // false as 'j' and 'J' are different 

	}

}
