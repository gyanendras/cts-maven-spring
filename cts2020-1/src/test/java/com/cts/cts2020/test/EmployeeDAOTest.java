package com.cts.cts2020.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cts.cts2020.Employee;
import com.cts.cts2020.dao.EmployeeDAO;

class EmployeeDAOTest {

	@Test
	void testGetAllEmployees() {
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    EmployeeDAO empdao=(EmployeeDAO)factory.getBean("daoOfEmp");  
		
		// EmployeeDAO empdao = new EmployeeDAO(); 
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
