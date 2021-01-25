package com.cts.cts2020;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class NewDateTime {
	
	public static void main(String[] args) throws ParseException {
		Date dt=null ; 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cl= Calendar.getInstance();
		
		dt = new Date();
		cl.set(1917, 11, 21);
		dt = cl.getTime();
		dt = sdf.parse("2004-05-25");
		
		LocalDateTime localDtTime = LocalDateTime.now();
		LocalDateTime localDtTime1 = LocalDateTime.of(1971,11,21,0,0,0);
		LocalDateTime localDtTime2 = LocalDateTime.parse("2004-01-24T10:15:30");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
		LocalDateTime localDtTime3 = LocalDateTime.parse("2004/01/24-01:12:24",dtf);
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		Period p = Period.ofDays(23);
		LocalDate lt3 = ld.plus(p);
		LocalDate lt4 = ld.minus(p);
		Period p2 = Period.between(lt3, lt4);
		Duration dr = Duration.ofHours(13);
		LocalTime lt2 = lt.plus(dr);
		
		Duration dr2 = Duration.between(lt, lt2);
		
		ZoneId zone = ZoneId.of("US/Arizona");
		ZoneOffset zf = ZoneOffset.UTC;
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		ZonedDateTime zt2 = ZonedDateTime.now(zf);
		
		LocalDate ld4 = localDtTime.toLocalDate();
		LocalTime lt5 = localDtTime.toLocalTime();
		
		
		
		
	}

}
