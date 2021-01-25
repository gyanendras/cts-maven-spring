package com.cts.cts2020;

public class TestWrappers {
	static int i = 10; //Short,Long, Float, Double
	static char ch = 'a';
	static double d = 10.10;
	static boolean flag = true;
	

	public static void main(String[] args) {
		Integer iW = i; //Integer.valueOf(i); //autoboxing
		Integer iw2 = Integer.valueOf(20);
		i = iw2; //unboxing
		flag = Boolean.valueOf(false);
		int j = 10;
		int y = Integer.parseInt("10");
		Integer yW = Integer.parseInt("20");
		Double dW2 =  Double.parseDouble("20.20");
		Boolean bW2 = Boolean.parseBoolean("true");
		if(bW2 && flag) { System.out.println("This is true ");
		long l = i;
		double d = l;
		
		// Long l2 = i;
		
		
		Double d1 = d;
		
		
	}

}
}
