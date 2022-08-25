package com.cg.mypack;
import com.cg.pack.*;
import com.cg.subpack.*;
public class B {
		public static void main(String[] args) 
		{
		com.cg.pack.A obj = new com.cg.pack.A();
		com.cg.pack.C obj1 = new com.cg.pack.C();
		com.cg.subpack.D obj2 = new com.cg.subpack.D();
		
		obj.msg();
		obj1.msg();		
	    obj2.msg();
		}

	}