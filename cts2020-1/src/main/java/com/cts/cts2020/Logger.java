package com.cts.cts2020;

// abstract class can have variables, 
// defined methods and abstract methods
// interfaces can only have abstract methods or default methods
// and no variables excepts constants.
//and multiple interface can be implemented by a class.
public interface Logger {
	//static final int j=10;
	int k=10;
 abstract public void log();
 static String selectDrive() {
	//  k=12;
	 //check which drive has vacant space and return it
	 return "E:";
 }
 
 void move();
 
}
