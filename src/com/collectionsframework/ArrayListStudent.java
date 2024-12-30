package com.collectionsframework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudent {

	public static void main(String[] args) {



		List<Student> studentList = ArrayListStudent.getArrayList();
		//List<Student> studentList = new ArrayList<Student>(); //Another way


		studentList.add(new Student(101, "Priyanka"));
		studentList.add(new Student(102, "Jyoti"));
		studentList.add(new Student(104, "Gaurav"));
		studentList.add(new Student(103, "Anjali"));
		studentList.add(new Student(105, "Deepa"));

		Iterator<Student> itr = studentList.iterator();
		//using new-keyword??

		while (itr.hasNext()) {
			Student s1 = itr.next();
			System.out.println(s1);
		}

		System.out.println("Fetching studentList elements using for-each loop: ");

		for (Student s1 : studentList) {
			System.out.println(s1);
		}

		System.out.println(" ");
		System.out.println("Fetching studentList elements using Java8 Lambda Expression forEach method: ");
		studentList.forEach((s1) -> {System.out.println(s1);});
	}

	public static ArrayList<Student> getArrayList() {
		return new ArrayList<>();
	}
}
