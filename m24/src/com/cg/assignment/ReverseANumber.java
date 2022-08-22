package com.cg.assignment;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Numebers  ");
		int num = sc.nextInt();
		int rev = 0;
		while (num > 0)
		{
			int dic = num%10;
			rev = rev * 10 + dic;
			num = num /10;
		
		}
		System.out.print("Enter The Reverse Numebers  " +rev);

	}

}
