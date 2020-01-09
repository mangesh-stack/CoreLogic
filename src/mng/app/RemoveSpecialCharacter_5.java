package assingment_3.app;

import java.util.Scanner;

public class RemoveSpecialCharacter_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String resultStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) <122) 
				resultStr = resultStr + str.charAt(i);
		}
		System.out.println("String after removing special characters: " + resultStr);
	}
}