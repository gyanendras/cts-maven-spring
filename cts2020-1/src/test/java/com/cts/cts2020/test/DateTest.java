package com.cts.cts2020.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class DateTest {
	
	@Test
	void testDate() {
		Date dt1 = new Date(2020-1901,12,30);
		assertEquals("Thu Jan 30 00:00:00 IST 2020",dt1.toString());
		//System.out.println(dt1);
		//assertEquals(1,1);
		// fail("Not yet implemented");
	}
	
}
