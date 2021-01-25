package com.cts.cts2020;

public interface Movable {
	final static public int MAX_SPEED = 80; 
	void move();
	static String selectDrive() {
		//  k=12;
		 //check which drive has vacant space and return it
		 return "P:";
	 }
	

}
