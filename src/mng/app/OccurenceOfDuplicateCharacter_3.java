package assingment_3.app;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class OccurenceOfDuplicateCharacter_3 {
	static void duplicateWords(String str) {
		char[] words=str.toLowerCase().toCharArray();
		HashMap<Character, Integer> wordCount = new HashMap<Character, Integer>();
		for (char word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		Set<Character> wordsInString = wordCount.keySet();
		for (char word : wordsInString) {
			if (wordCount.get(word) > 1) 
				System.out.println(word + " : " + wordCount.get(word));	
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
			duplicateWords(str);		
	}
}