package com.cg.task1;

public class Task3 {
	 public int SquareNumbers(int input_integer ) 
	{
		
		    int Square = input_integer*input_integer;
		    return Square;
	}
	 public int CountOfChar(String input_string , char input_character ) 
	{	    
		      
		      int Count = 0;
		      for(int i = 0; i < input_string.length(); i++) 
		      {
		         if(input_character == input_string.charAt(i)) 
		         {
		            ++Count;
		         }
	}
	 
	 
	 
	 public static void main(String[] args) {
		    
		    int num1 = 25;
		    String input_string = "Khan Inzamam";
		    char input_character = 'a';
		    // create an object of Main
		    Task3 obj = new Task3();
		    // calling method
		    int result = obj.SquareNumbers(num1);
		    System.out.println("square of a number   "+result);
		    
		    int result1 = obj.CountOfChar(String input_string)
		    System.out.println("The string is defined as: " +input_string);
		    System.out.println("The frequency of " + input_character + " is " + result1 );
	 }}
		    