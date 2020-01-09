package com.app;

public class Test {
   public static void main(String[] args) {
       MyThread1 my1=new MyThread1();
       Thread th=new Thread(my1);
       MyThread2 my2=new MyThread2();
       Thread th2= new Thread(my2);
       th.start();
       th2.start();
       
	}

}
