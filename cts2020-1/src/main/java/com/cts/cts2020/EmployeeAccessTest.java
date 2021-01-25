package com.cts.cts2020;

public class EmployeeAccessTest {

	public static void main(String[] args) {
		Employee e ;
		// int age = Contractor.retirementAge;
		Contractor cont1 = new Contractor();
		// double c = cont1.getSalary();
		String s = cont1.getFname(); //cont1.fname;
        cont1.setFname("new Fname1");		// cont1.fname = "new Fname1"; 
        cont1.lname = "direct var";
	}

}
