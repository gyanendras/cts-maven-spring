package com.cts.cts2020;

import java.time.LocalDate;

public class Contractor {
	
	private Double salary;
	LocalDate doj;
	private String fname;
	String lname; // package, default
	


	Long contractorId;
	private static Integer retirementAge = 60;
	

	public static void main(String[] args) {
		Contractor cont1 = new Contractor();
		double c = cont1.getSalary();

	}
	
	private Double getSalary() {
		return salary;
	}
	
	
	private void setSalary(Double sal) {
		salary =  sal;
		 
	}
	
	 String getFname() {
		return fname;
	}

	 void setFname(String fname) {
		this.fname = fname;
	}
	 
	 public Employee selectHighestPaidEmployee(){
		 Employee e = new Employee();
		 e.setSalary(10000000.00);
		 return e;
	 }

}
