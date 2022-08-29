package com.cg.string;

public class EndsWithDemo {

	public static void main(String[] args) {
		String s1="khan Inzamam";  
		System.out.println(s1.endsWith("m"));  //The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println(s1.endsWith("khan")); //It returns true if this string ends with the given suffix; else returns false.
	}

}

