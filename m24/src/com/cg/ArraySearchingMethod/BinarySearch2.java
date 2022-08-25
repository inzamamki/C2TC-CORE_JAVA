package com.cg.ArraySearchingMethod;
import java.util.Arrays;

public class BinarySearch2 {
	public static void main(String[] args)
    {
     // Declaring and initializing byte arrays
     // to search over them
     byte byteArr[] = { 10, 20, 15, 22, 35 };
     
     int intArr[] = { 10, 20, 15, 22, 35 };
     double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
     float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
  

     // Using sort() method of Arrays class
     // and passing arrays to be sorted as in arguments
     Arrays.sort(byteArr);
     Arrays.sort(intArr);
     Arrays.sort(doubleArr);
     Arrays.sort(floatArr);
    

     // Primitive datatypes
     byte byteKey = 35;
     int intKey = 22;
     double doubleKey = 1.5;
     float floatKey = 35;
     

     // Now in sorted array we will fetch and
     // return elements/indiciesaccessing indexes to show
     // array is really sorted

     // Print commands where we are implementing
     System.out.println(byteKey + " found at index = "+ Arrays.binarySearch(byteArr, byteKey));
     System.out.println(intKey + " found at index = "+ Arrays.binarySearch(intArr, intKey));
     System.out.println( doubleKey + " found at index = "+ Arrays.binarySearch(doubleArr, doubleKey));
     System.out.println(floatKey + " found at index = "+ Arrays.binarySearch(floatArr, floatKey));
     
 }
}