package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(40);
		arrayList.add(null);
		arrayList.add(10);
		arrayList.add(null);

		System.out.println("Fetching arrayList elements using Iterator: ");

		Iterator<Integer> itr = arrayList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(" ");
		System.out.println("Fetching arrayList elements using normal for-loop: ");

		for (int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println(" ");
		System.out.println("Fetching arrayList elements using for-each loop : ");

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println(" ");
		System.out.println("Fetching arrayList elements using Java8 Lambda Expression for-each loop: ");

		arrayList.forEach((e1) -> {System.out.println(e1);});
	}
}
