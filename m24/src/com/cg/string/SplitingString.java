package com.cg.string;

public class SplitingString {

	public static void main(String[] args) {
		String s1="string split method of Java is  done by Khan Inzamam";  
		//The java string split() method splits this string against given regular expression
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		
		//using java foreach loop to print elements of string array  
		for(String w:words)
		{  
		System.out.println(w);  
		}
	}
	//and returns a char array.

}

