package com.cts.cts2020;

public class MultiThreading {
    static int i =0;
    synchronized void  addArray(){
    	
    }
    
	public static void main(String[] args) {
		int[] x = new int[1000];
		
		Runnable r = ()->{
			int j=0;
			synchronized(MultiThreading.class){j =++i;}
			
			String s = Thread.currentThread().getName();
			while(true) {
				System.out.println(s+" "+j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t0.start();
		t1.start();
		t2.start();

	}

}
