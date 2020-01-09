package assingment_3.app;

import java.util.Scanner;

public class ReverseString_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String to reverse:");
	String str=sc.nextLine(),rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
	}
	System.out.println("Reverse String: "+rev);
	
	
}
}
