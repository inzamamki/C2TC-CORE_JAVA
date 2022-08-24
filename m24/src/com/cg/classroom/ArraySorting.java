package com.cg.classroom;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
	
		int[] arr = {10,20,12,3,24,28};
		System.out.println("enter the array   ");
		for (int num :arr)
		{
			System.out.println(num + " ");
			
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array is =  ");
		for ( int num : arr)
		{
			System.out.println(num + " ");
		}
		System.out.println("the length of the arrays ::");
		System.out.println(arr.length);
		}}
		
