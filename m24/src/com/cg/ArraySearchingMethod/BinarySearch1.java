package com.cg.ArraySearchingMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch1 {
	public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<Integer>();// Creating empty List
	 
	        // Adding elements to the List
	        al.add(12);
	        al.add(53);
	        al.add(23);
	        al.add(46);
	        al.add(54);
	 
	        int index = Collections.binarySearch(al, 23);// Using binarySearch() method of Collections class
	 
	        System.out.print(index);
	    }
	}