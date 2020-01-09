package com.app;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println("Mythread2  "+i);
			
			try {
				java.lang.Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
