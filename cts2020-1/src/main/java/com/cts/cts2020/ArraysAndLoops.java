package com.cts.cts2020;

public class ArraysAndLoops {

	public static void main(String[] args) {
		int[] myIntArray = new int[10];
		int[] myIntArray2 = new int[] {1, 4, 5, 8, 7 ,9};
		String[] listofWords = new String[] {"Red","Blue","Green","Yellow"};
		String[] colors = new String[5];
		Human[] busQ = new Human[10];
		busQ[0]= new Person("Mohan", "Bajaj");
		busQ[1]= new Worker(34l,1100.00,"Mohan1", "Bajaj1","M");
		// busQ[1].getAadhaar();
		
		System.out.println(myIntArray2[2] + myIntArray2[0]);
		System.out.println(listofWords[3]);
		
		for(int i=0;i<4;i++) {
			System.out.println(listofWords[i]);
		}
		
		int i=0;
		while(i<6) {
			System.out.println(myIntArray2[i]);
			myIntArray[i]=myIntArray2[i]*10;
			i++;
			
			
		}
		
		for(int j=0;j<4;j++) {
			System.out.println(myIntArray[j]);
			
		}
		
		for(String s:listofWords) {
			System.out.println(s);
		}

	}

}
