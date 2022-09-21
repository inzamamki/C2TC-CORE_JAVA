package com.cg.task1;

public class Task2 {

	public static void main(String[] args) {
		int input_integer = 5;
		System.out.println("square of a number   "+input_integer*input_integer);
	    
	      String input_string = "Khan Inzamam";
	      System.out.println("The string is defined as: " +input_string);
	      char input_character = 'a';
	      int Count = 0;
	      for(int i = 0; i < input_string.length(); i++) 
	      {
	         if(input_character == input_string.charAt(i)) 
	         {
	            ++Count;
	         }
		      }

	   
	      System.out.println("The frequency of " + input_character + " is " + Count );
	
}
	}
