package com.cg.assignment;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter The Numebers  ");
			int num = sc.nextInt();
			int fact =1;
			if (num < 0)
				System.out.print("Factorial is NOt Negative");
			else if (num == 0)
				System.out.print("factorial of 0 is 1");
			else {
				for (int i=1;i <= num; ++i) {
					fact=fact*i;
					//if (num % i ==0) 
					{
						System.out.print(i+" , ");
					}
					}
				System.out.print("\n Factorial of the number: "+fact);
					}
		}
		}

}
