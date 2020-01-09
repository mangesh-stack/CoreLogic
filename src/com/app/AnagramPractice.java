package com.app;

import java.util.Scanner;

public class AnagramPractice {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       String name=sc.nextLine(),str="";
      // int len=name.length();
       for(int j=1;j<=5;j++) {
       for(int i=name.length()-1;i>=0;i--){		
    	     str=str+name.charAt(i);
       }
       System.out.println(str);
       }
       sc.close();  
	}

}
