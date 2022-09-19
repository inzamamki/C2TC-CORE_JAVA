/*ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
 Unlike queue, we can add or delete the elements from both the ends.
ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.*/

package com.cg.collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeInDequeInterface {
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements
		Iterator itr=Deque.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		}  
		}  