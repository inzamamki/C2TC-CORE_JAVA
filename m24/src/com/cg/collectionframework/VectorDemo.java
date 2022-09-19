/*Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
However, It is synchronized and contains many methods that are not the part of Collection framework.*/

package com.cg.collectionframework;
import java.util.*;


public class VectorDemo {
	public static void main(String args[]){  
		Vector v=new Vector();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}  