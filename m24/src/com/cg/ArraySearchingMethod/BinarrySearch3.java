package com.cg.ArraySearchingMethod;
import java.util.Arrays;
public class BinarrySearch3 {
	public static void main(String[] args)
    {
     // Declaring and initializing byte arrays
     // to search over them
		char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
		short shortArr[] = { 10, 20, 15, 22, 35 };
		
		
		Arrays.sort(charArr);
		Arrays.sort(shortArr);
		
		char charKey = 'p';
		short shortKey = 22;
		
		 System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, charKey));
		 System.out.println(shortKey + " found at index = "+ Arrays.binarySearch(shortArr, shortKey));
		
}
}