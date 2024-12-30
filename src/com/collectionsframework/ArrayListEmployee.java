package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		//List<Student> studentList = new ArrayList<Student>(); //Another way

		employeeList.add(new Employee(101, "Siri"));
		employeeList.add(new Employee(102, "Alexa"));
		employeeList.add(new Employee(104, "Gemini"));
		employeeList.add(new Employee(103, "Cortana"));
		employeeList.add(new Employee(105, "Bixby"));

		Iterator<Employee> itr = employeeList.iterator();
		//using new-keyword??

		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
		System.out.println(" ");
		System.out.println("Fetching employeeList elements using for-each loop: ");

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		System.out.println(" ");
		System.out.println("Fetching employeeList elements using Java8 Lambda Expression: ");
		employeeList.forEach((emp)-> {
			System.out.println(emp);
		});

	}
}
