package com.app;
public class RevEachWordString {
	 static String reverseWords(String str){ 
	        String[] temp = str.split(" "); 
	        String result = ""; 
	        for (int i = 0; i < temp.length; i++) { 
	            if (i == temp.length - 1) 
	                result = temp[i] + result; 
	            else
	                result = " " + temp[i] + result; 
	        } 
	        return result; 
	    } 
	    public static void main(String[] args) 
	    { 
	        String s2 = "I love Java Programming"; 
	        System.out.println(reverseWords(s2)); 
	    } 
}
