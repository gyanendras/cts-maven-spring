package com.cts.cts2020;

import java.time.LocalDate;

public class Employee {
   //attributes/memeber variables/properties
	private Long employeeId;
	Double salary;
	LocalDate doj;
	String fname;
	String lname;
	// Address addr;
	private static Integer retirementAge = 60;
	
	
    //constructors
	public Employee(String firstName, Long id) {
		fname = firstName;
		employeeId = id;
	}
	
	//constructors
	public Employee(String firstName,String lastName, Long id) {
		fname = firstName;
		lname = lastName;
		employeeId = id;
	}
	//constructors - default
	public Employee() {
		employeeId = 0l;
	}


	public static void main(String[] args) {
		Employee ram = new Employee("Ram","Sri",11l);
		Employee tom = new Employee("Tom",2l);
		
		System.out.println(ram.getName());
		System.out.println(tom.getName());
		tom.setName("TomNew", "Smith");
		System.out.println(tom.getName());
		tom.setSalary(1200.00);
		System.out.println(tom.calculateBonus());
		System.out.println(tom.getRetirementAge());
		System.out.println(ram.getRetirementAge());
		ram.setRetirementAge(70);
		System.out.println(tom.getRetirementAge());
		System.out.println(ram.getRetirementAge());
		char c = 'a';
		Character c1 = c;
		c1='b';
		c1 = new Character('o');
		c1 = Character.valueOf('o'); 
		c = c1;
		
		String s = tom.getName();
		
	}
	
	public void setRetirementAge(int age) {
		retirementAge = age;
		
	}

	public Integer getRetirementAge() {
		return retirementAge;
	}

	public void setSalary(double sal) {
		salary = sal;
		
	}

	public String getName() {
		return fname +" "+ lname;
		
		
	}
	
	public void setName(String firstName, String lastName) {
		fname = firstName;
		lname = lastName;
	}
	
	public double calculateBonus() {
		return 5*salary/100+retirementAge/10;
	}
  
	// Create another constructor that sets salary, 
	//  fname, lastname and emp id
	// Create Lina Kaur, 12, 12000.
	//  create getSalary method and print name and salary of Lina.
	// Use getName for name and getSalary for salary. 

}
