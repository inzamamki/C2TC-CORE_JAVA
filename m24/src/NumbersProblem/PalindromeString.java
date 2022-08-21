package NumbersProblem;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
			String original, reverse = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter The String  ");
			original = sc.nextLine();  
	      int length = original.length(); 
			System.out.println("Original word: " +original);
			
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println(reverse+"Entered string is a palindrome.");  
	      else  
	         System.out.println(reverse+"Entered string isn't a palindrome.");   
	
		}}
	     

