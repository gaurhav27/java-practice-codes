package com.october.oops;

public class EmployeeClient {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setId(10);
		emp.setName("Gaurav");
		emp.setDept("Dev");
		emp.setSalary(50000);

		System.out.println("Emp ID : " + emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getDept());
		System.out.println(emp.getSalary());

		System.out.println(emp);

		Object obj = new Object();
	}
}
