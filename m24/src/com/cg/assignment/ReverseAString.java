package com.cg.assignment;
import java.util.Scanner;


public class ReverseAString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter The String  ");
			String str = sc.next();
			String nstr = " ";
			char ch;
			int length = str.length();
			//System.out.print("Original word: " +str);
    for (int i = 0;i < length;i++)
    {
			 ch =str.charAt(i);
			 nstr=ch+nstr;		 	 
    }
    System.out.println("Reversed word: "+ nstr);
		}
	}

}
