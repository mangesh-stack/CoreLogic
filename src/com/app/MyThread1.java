package com.app;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
         for(int i=1;i<=10;i++) {
        	 System.out.println("thread1 valure"+" "+i);
        	try {
				java.lang.Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
         }
	}

}
