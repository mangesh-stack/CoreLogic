package com.app;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
     String original,str="";
     int i;
     Scanner sc=new Scanner(System.in);
     original=sc.nextLine();
     for(i=original.length()-1;i>=0;i--) {
    	 str+=original.charAt(i);
     }
     System.out.println("reverse String:"+str);
     if(original.equals(str))
    	 System.out.println("String is palindrome");
     else
    	 System.out.println("not palindrome");
	}

}
