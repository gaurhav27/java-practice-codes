package com.collectionsframework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(null);
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		Enumeration<Integer> enumeration = vector.elements();

		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		for (Integer i : vector) {
			System.out.println(i);

			vector.forEach((v) -> {System.out.println(v);});
		}
	}
}
