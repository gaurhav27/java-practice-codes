package com.collectionsframework;

import java.util.ArrayList;

public class GetSmallerElementsOperaton {

	public static ArrayList<Integer> smallNumbers(int[] arrayInput, int referenceNumber) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i< arrayInput.length; i++) {
			if (arrayInput[i] < referenceNumber) {
				answer.add(arrayInput[i]);
			}
		}
		return answer;
	}
}

