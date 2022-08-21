package NumbersProblem;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		long num,sum = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Number......  ");
			num = sc.nextLong();
		}
		int factorial;
		for (factorial=1;factorial<num;factorial++)
		{
			if (num % factorial == 0) {
				sum =  sum + factorial;
				
			}
		}
		
		if (sum == num)
		System.out.println(sum+"    Enter  Number is Perfect Number");
		else
			System.out.print(sum+"    Enter  Number is Not Perfect Number");
		

	}

}
