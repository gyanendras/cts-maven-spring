package com.cts.cts2020;

public class TestString {
	String baseStr = "Hello World";

	public static void main(String[] args) {
        
		TestString anObj = new TestString();
		String locStr = "Welcome 2021";
		System.out.println(anObj.baseStr +" "+ locStr);
		System.out.println(anObj.baseStr.concat(" ").concat(locStr));
		System.out.println("Lenght is " + locStr.length());
		System.out.println("Contains 2021 " + locStr.contains("2021"));
		System.out.println(locStr.charAt(8));
		System.out.println(locStr.indexOf('2'));
		System.out.println(locStr.lastIndexOf('2'));
		System.out.println(locStr.substring(8));
		System.out.println(locStr.substring(8,10));
		System.out.println(locStr.toLowerCase());
		System.out.println(locStr);
		
		String abc = "Welcome 2021";	
		System.out.println(locStr == abc);
		System.out.println(locStr.equals(abc));
		
			

	}

}
