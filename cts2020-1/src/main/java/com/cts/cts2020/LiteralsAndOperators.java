package com.cts.cts2020;

import java.util.Scanner;

public class LiteralsAndOperators {
	/*
	 * operators, scanner, if else ,switch case relational and logical literal,
	 * string, concat, immutable, substring, indexOf lastIndexOf. Arrays Loops.
	 */
	

	public static void main(String[] args) {
		int i = 10;
		char myfav = 'z';
		float f = 45.50f;
		double PI = 3.14;
		byte vSmInt = 120;
		short smInt = 4444;
		int myCityPop = 300000;
		long myStatePop = 300000000l;
		boolean flag = true;
		
		LiteralsAndOperators lop = new LiteralsAndOperators();
		System.out.println("Trying Literal and Ops");
		System.out.println(f + " " + myStatePop 
				              + " " + vSmInt);
		double result = f * PI + ++myStatePop;
		boolean b = (PI<f || false ) && true;
		System.out.println(result +" "+ b);
		
		// bitwise 
		// shift
		int x = 4; //000-3011
		// x = x>>1;  // 000000000001
		// x = x<<31;  // 1100000
		int y = 2; // x|y; 11|10 = 11
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x&y));
		
		Scanner s = new Scanner(System.in);
		String p = s.next();
		System.out.println(p);
		float mynum = s.nextFloat();
		Float myFloat = mynum;
		
		double mydub = s.nextDouble();
		System.out.println(mynum); 
		
		String myFavQuote = "work and play";
		
		
		
		if(mydub == 3.14 ) {
			System.out.println("it is a PI");
		
			
		}else {
			System.out.println("it is not a PI");
		}
		
		 switch(5) {
		 case 2:
			 System.out.println("IT is 2"); 
		 case 3:
			 // do something
			 String s1 = "In case 3";
			 System.out.println("IT is close to pi");
			 // break;
		 case 4:
			// do something
			 s1 = "In case 4";
			 System.out.println("it is 4");
		 default:
				// do something
				 s1 = "In case default";
				 System.out.println("it is default");
			 
		 }
		
		
	}

}
