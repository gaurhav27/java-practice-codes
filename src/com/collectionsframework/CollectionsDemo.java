package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Hari");
		list.add("Deepa");
		list.add("Anjali");
		list.add("Surendra");
		list.add("Gaurav");
		list.add("Hari");

		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
