package com.cg.assignment;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number ..");
			int n =sc.nextInt();
			int temp = n;
			int result = 0;
			String str = Integer.toString(n);
			int length = str.length();
			
			while (temp != 0)
			{
				int lastdigit = temp % 10;
				result += Math.pow(lastdigit, length);
				temp /= 10;
					
			}
			if (result == n)
				System.out.print("   "+n+ "   IS an Armstrong number");
			else
				System.out.print(n+ "   IS NOT an Armstrong number");
		}
		
	}

}
