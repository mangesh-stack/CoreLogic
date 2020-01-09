package assingment_3.app;

import java.util.Scanner;

public class RevEachWordString2 {
	static void reverseWords(String str) {
		String[] words=str.split(" ");
		String reversedString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord+=word.charAt(j);
			}
			reversedString+=reverseWord+" ";
		}
		System.out.println(str);
		System.out.println(reversedString);
		
	}

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String to reverse word:");
         String str=sc.nextLine();
         
         reverseWords(str);
         
	}

}
