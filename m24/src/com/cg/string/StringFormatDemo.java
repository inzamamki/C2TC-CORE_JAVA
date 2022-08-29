package com.cg.string;

public class StringFormatDemo {
	
	//The java string format() method returns the formatted string by given locale, format and arguments.
	//The format() method of java language is like sprintf() function in c language and printf() method of java language.
	public static void main(String[] args) {
		
		String name="Inzamam";  
		String sf1=String.format("My name is %s",name);  
		String sf2=String.format("The value is %f",52.3343);  //returns 6 char fractional part filling with 0  
		//%40 means distance. 
		String sf3=String.format("value is %40.12f",48.334);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3); 

}

}




