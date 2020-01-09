package com.app;

import java.util.Scanner;

public class PrimeNumber {
     public static void main(String[] args) {
         int num;
         boolean isPrime=true;
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         for(int i=2;i<=num/2;i++) {
        	 if(num%i==0) {
        		 isPrime=false;
        		 break;
        	 }
         }
         if(isPrime)
        	 System.out.println("number is prime "+num);
         else
        	 System.out.println("number is not prime "+num);
        	 
	}

}
