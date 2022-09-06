package com.cg.task;

import java.util.Scanner;

public class SumOfNNumbers  {  
	
public static void main(String args[])  {  
	
int i, sum=0, z;  

Scanner sc = new Scanner(System.in);  
System.out.print("\n Enter Number of Numbers to be Calculated: ");  
int n = sc.nextInt();
//loop executes n times 
for(i=0;i<n;i++)    
{  
System.out.print("Enter the number: ");  
//reads integer from the user  
z = sc.nextInt(); 
sum=sum+z;       //calculates sum  
}  
System.out.println("The sum of the numbers is: "+sum);  
}  
}  