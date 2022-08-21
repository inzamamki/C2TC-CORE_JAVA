package NumbersProblem;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Numebers  ");
		int n = sc.nextInt();
		int i,m = 0,flag = 0;
		m=n/2;   
		if(n==0||n==1){
		System.out.println(n+" is not prime number"); 
		}
		for (i = 2; i <= m; i++) {
		      
		      if (n % i == 0) {
		    	  flag++;
		      }
		    }
	    if ( flag > 0)
	        System. out.println("The number is not prime");
	      else
	        System. out.println("The number is prime");
		
		
	

	}

}
