package com.collectionsframework;

import java.util.ArrayList;

public class EvenOddOperation {

	public static void getEvenOdd(int[] inputArray) {

		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for (int i=0; i<inputArray.length; i++) {
			if (inputArray[i] % 2 == 0) {
				even.add(inputArray[i]);
			}
			else {
				odd.add(inputArray[i]);
			}
		}

		for (int i=0; i<odd.size(); i++) {
			System.out.println(odd.get(i) + " ");
		}
		for (int i=0; i<even.size(); i++) {
			System.out.println(even.get(i) + " ");
		}

	}
}
