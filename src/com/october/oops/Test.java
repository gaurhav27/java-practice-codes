package com.october.oops;

public class Test {

	public static void main(String[] args) {

		String inputString = "Gaurav Singh";
		String reversedString = "";
		String reversedStringSb = "";

		StringBuffer stringBuffer = new StringBuffer(inputString);

		reversedStringSb = stringBuffer.reverse().toString();
		System.out.println("The reversed String of " + inputString + " is : " + reversedStringSb);


		//Without using in-built methods
		//Using reverse-loop
		for (int i=inputString.length()-1; i>=0; i--) {
			reversedString = reversedString + inputString.charAt(i);
		}
		System.out.println("The reversed String of " + inputString + " is : " + reversedString);


	}
}
