package com.cts.cts2020;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestDateAndCalendar {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		Date dt1 = new Date(2020-1901,12,30);
		System.out.println(dt1);
		Date dt3 = new Date();
		dt3.setYear(2019-1900);
		System.out.println(dt3);
		Date dt4 = new Date();
		dt4.parse("Sat, 12 Aug 1995");
		System.out.println(dt4);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(df.format(dt));
		System.out.println(sdf.format(dt));
		try {
			Date dt5 = sdf.parse("1999/06/30");
			System.out.println(dt5);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		c.set(1998,11,25);
		Date dt7 = c.getTime();
		System.out.println(dt7);
		c.add(Calendar.YEAR, 2);
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone());
		c.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd z");
		sdf2.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(sdf2.format(c.getTime()));
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
