package NumbersProblem;

import java.util.Scanner;

public class DuplicateCharactersInAstring {

	public static void main(String[] args) {
		String original;
		int count ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String  ");
		original = sc.nextLine();
 
		char string[] = original.toCharArray();  
		System.out.print("Duplicate characters in a given string: "); 
		for (int i = 0;i<original.length();i++) {
			count=1;
			 for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;  
	                    string[j] = '0';  
	                }  
	            }  
	            
	            if(count > 1 && string[i] != '0')  
	                System.out.println(string[i]);  
		}
		

	}}

