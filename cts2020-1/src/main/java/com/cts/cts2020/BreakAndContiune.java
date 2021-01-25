package com.cts.cts2020;

public class BreakAndContiune {
	 

	public static void main(String[] args) {
		int[] myIntArray2 = new int[] {1, 4, 5, 8, 7 ,9};
		String[] listofWords = new String[] {"Red","Blue","Green","Yellow"};

		for(int j=0;j<4;j++) {
			System.out.println("J Is "+ j);

			for(int i=0;i<4;i++) {
				if(i==2)break;
				System.out.println(listofWords[i]);
				
			}
			
			}
	}

}
