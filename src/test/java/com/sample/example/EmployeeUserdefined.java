package com.sample.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeUserdefined extends UserDefinedClass2{

	public static void main(String[] args) {
		
//		List<EmployeeUserdefined> emp = new ArrayList<EmployeeUserdefined>();
		Set<EmployeeUserdefined> ex= new HashSet<EmployeeUserdefined>();
		
		EmployeeUserdefined e1 = new EmployeeUserdefined();
		e1.setEmployeeaddress("djkafhjkahkjdhasjkfldahsjk");
		e1.setEmployeeemail("akldjfajflkasjf");
		e1.setEmployeeid(32434654);
		e1.setEmployeename("ajflkjaldfjaslkfsd");
		EmployeeUserdefined e2 = new EmployeeUserdefined();
		e2.setEmployeeaddress("skdhkfadhkja");
		e2.setEmployeeemail("kadhfkadhfkjdsah");
		e2.setEmployeeid(13464);
		e2.setEmployeename("akjfhkahfkjdash");
//		emp.add(e1);
//		emp.add(e2);
		ex.add(e1);
		ex.add(e2);
		
//		for (EmployeeUserdefined employeeUserdefined : emp) 
		for (EmployeeUserdefined employeeUserdefined2 : ex) {
			System.out.println(employeeUserdefined2.getEmployeeaddress());
			System.out.println(employeeUserdefined2.getEmployeeemail());
			System.out.println(employeeUserdefined2.getEmployeeid());
			System.out.println(employeeUserdefined2.getEmployeename());
			
		}
	}
}
