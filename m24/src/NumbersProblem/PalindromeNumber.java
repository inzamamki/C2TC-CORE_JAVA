package NumbersProblem;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter The Numebers  ");
			int num = sc.nextInt();
			int temp = num;
			int rev = 0;
			while (num > 0)
			{
				int rem = num %10;
				rev = rev *10 + rem;
				num =num/10;
			}
		if (temp == rev)
			System.out.print(" Given  Number is palindrome number  "+rev);
		else
			System.out.print("Given Number is Not palindrome number");
			
		}
	}

}
