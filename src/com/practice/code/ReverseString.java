package com.practice.code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String reversedArray = "";
		String reversed = "";

		//      ??      Query       ??      //
		//Didn't declare reversedString but still it worked, but it's not working if we are not declaring reversedArray and reversed!!
		//When to initialize a variable and when to not?
		//split(regex: "") how it worked for sentence also?

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the String you want to reverse: ");
		String inputString = scanner.nextLine();


		//Using in-built methods
		StringBuffer stringBuffer = new StringBuffer(inputString);
		String reversedString = stringBuffer.reverse().toString();
		System.out.println("Using in-built method, the Reversed String is : " + reversedString);


		//Using Array - Without using in-built methods
		String[] stringArray = inputString.split("");

		for (int i=stringArray.length-1; i>=0; i--) { //Reverse loop
			reversedArray = reversedArray + stringArray[i];
		}
		System.out.println("Without using in-built method, the Reversed String is : " + reversedArray);

		//Without using Array - Without using in-built methods
		for (int i=inputString.length()-1; i>=0; i--) {
			reversed = reversed + inputString.charAt(i);
		}
		System.out.println("Without using in-built method, the Reversed String is : " + reversed);

		scanner.close();
	}
}
