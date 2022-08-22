package com.cg.assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Numer ..");
			int n =sc.nextInt();
			int a = 0;
			int b = 1;
			int c = 0;
			System.out.println("Fiobanacci Series till  "+n+" is ");
			
			if (n<0)
			{
				System.out.println("Fibonacci Series is " +a);
			}
			else if (n==1)
			{
				System.out.println("Fiobanacci Series is " +a);
			}
			else {
				for (int i =2; i<=n;++i){
				System.out.print(a + " ");
				c = a+b;
				a=b;
				b=c;
				}
				
			}
		}

	}

}
