package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGfG {

	public static void main(String[] args) {

		ArrayList<String> arrayInput = new ArrayList<>();

		arrayInput.add("Siri");
		arrayInput.add("Alexa");
		arrayInput.add("Cortana");
		arrayInput.add("Bixby");

		System.out.println("ArrayList traversal using for-loop : ");
		for (int i=0; i<arrayInput.size(); i++) {
			System.out.println(arrayInput.get(i));
		}

		System.out.println(" ");
		System.out.println("ArrayList traversal using for-each loop : ");
		for(String output : arrayInput) {
			System.out.println(output);
		}

		System.out.println(" ");
		System.out.println("ArrayList traversal using Iterator : ");

		Iterator<String> itrString = arrayInput.iterator();
		while (itrString.hasNext()) {
			System.out.println(itrString.next());
		}

		ArrayList<Integer> arrayInteger = new ArrayList<>();
		arrayInteger.add(10);
		arrayInteger.add(20);
		arrayInteger.add(5);
		arrayInteger.add(25);

		System.out.println(" ");
		System.out.println("Modifying items of ArrayList during Traversal : ");

//		for (int i=0; i<arrayInteger.size(); i++) {
//			int x = arrayInteger.get(i);
//			arrayInteger.set(i, x*2);
//		}
//		System.out.println(arrayInteger);

		System.out.println(" ");
		System.out.println("Removing items during Traversal : ");

		Iterator<Integer> itrInteger = arrayInteger.iterator();
		while (itrInteger.hasNext()) {
			int x = (Integer) itrInteger.next();
			if (x<10)
				itrInteger.remove();
			else
				System.out.println(x);
		}

		System.out.println(" ");
		System.out.println("ArrayList traversal using Java8 Lambda Expression forEach() Method");

		arrayInteger.forEach(x-> System.out.println(x));
	}
}
