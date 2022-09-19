/*The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e.,
 Stack. The stack contains all of the methods of Vector class
  and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.*/

package com.cg.collectionframework;
import java.util.*;
import java.util.Stack;

public class StackInVector {
	
	public static void main(String args[]){  
		Stack stack = new Stack();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop(); //last out
		stack.peek();//look out the first object
		Iterator itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}  
