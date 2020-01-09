package com.app;


public class RemoveDuplicateString {
	static void removeDuplicate(String str) {
		String[] words=str.toLowerCase().split(" ");
		int i,j;
		for(i=0;i<words.length;i++) {
			if(words[i]!=null) {
				for(j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						words[j]=null;
					}
				}
			}
		}
		
		for(int k=0;k<words.length ;k++) {
			if(words[k]!=null)
			System.out.println(words[k]+" ");
		}
			
	}

	public static void main(String[] args) {
		removeDuplicate("career career mangesh how are you are");
	}
}
