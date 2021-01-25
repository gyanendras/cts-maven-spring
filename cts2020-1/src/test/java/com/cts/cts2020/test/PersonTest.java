package com.cts.cts2020.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cts.cts2020.Aadhaar;
import com.cts.cts2020.NoAadharException;
import com.cts.cts2020.Person;

public class PersonTest {
	Person p =null;
	
	@BeforeEach
	void runsBeforeTest() {
		p = new Person("Mohit","Keswani");
	}
	
	@AfterEach
	void cleanUp() {
		p=null;
	}
	
    @Test
	void testPersonName(){
	//Person p = new Person("Mohit","Keswani");
	assertEquals("Mohit"+" "+"Keswani",p.getName());
	
	}
    
    @Test
    void testPersonAAdhaar() throws NoAadharException {
    	//Person p = new Person("Mahesh","Arora");
    	Aadhaar a = new Aadhaar();
    	a.setAadhaarNum(23l);
    	assertEquals(23,a.getAadhaarNum().longValue());
    	p.setAadhaar(a);
    	assertEquals(23, p.getAadhaar().getAadhaarNum().longValue());
    	assertTrue(true);
    	
    }
    
    @Test
    void testNoAdhaarException()  {
    	Person p = new Person("Mahesh","Arora");
    	//Aadhaar a = new Aadhaar();
    	//p.setAadhaar(a);
    	Exception exception = 
    			assertThrows(NoAadharException.class, () -> {
    				p.getAadhaar();
        });
    	System.out.println(exception.getMessage());
    	
    }
    
    //Todo Test get Driving License from person

}
