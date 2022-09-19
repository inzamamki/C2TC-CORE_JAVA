package com.cg.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("Avantika");
		l.add(29);
		l.add(60);
		l.add("A+");
		l.add(null);

		System.out.println(l);

		l.remove(2);
		System.out.println(l);
		l.clone();
		System.out.println(l);

	}

}
