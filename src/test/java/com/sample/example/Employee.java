package com.sample.example;

import java.awt.List;
import java.util.ArrayList;

public class Employee extends UserdefinedClass {

	public static void main(String[] args) {
		
		java.util.List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setId(12345);
		e1.setEmail("saisrisankaran@gmail.com");
		e1.setName("Srikanth");
		Employee e2 = new Employee();
				e2.setEmail("ddddd");
		e2.setId(12345);
		e2.setName("jhdkjahfjkd");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e1);
		for (Employee e : emp) {
			
			System.out.println(e.getEmail());
			System.out.println(e.getId());
			System.out.println(e.getName());
		}
	}
}
