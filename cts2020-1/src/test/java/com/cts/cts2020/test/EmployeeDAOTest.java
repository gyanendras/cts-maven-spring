package com.cts.cts2020.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cts.cts2020.Employee;
import com.cts.cts2020.dao.EmployeeDAO;

class EmployeeDAOTest {

	@Test
	void testGetAllEmployees() {
		EmployeeDAO empdao = new EmployeeDAO();
		List<Employee> l = empdao.getAllEmployees();
		Assertions.assertEquals(116, l.size());
	}
	
	@Test
	void testGetConnection() {
		EmployeeDAO empdao = new EmployeeDAO();
		Connection c = empdao.getConnection();
		assertNotNull(c);
		
		
	}
	
	@Test
	void testGetEmpByLname() {
		EmployeeDAO empdao = new EmployeeDAO();
		
		List<Employee> eList = empdao.getEmpByLname("Cambrault");
		
		
		System.out.println(eList.get(0).getName());
	}
	
	// write a test case for getAllDepartments

}
