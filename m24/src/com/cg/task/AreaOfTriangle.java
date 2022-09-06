package com.cg.task;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Breadth =");
		double Breadth = sc.nextDouble();
		
		System.out.println("Enter the Height =");
		double Height = sc.nextDouble();

		double area=  (Breadth * Height)/2;
		
		System.out.println("Area of Triangle =" +area);
		
	}

}