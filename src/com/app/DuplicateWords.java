package com.app;

public class DuplicateWords {
   public static void main(String[] args) {
	int i,j,k=0;
	for(i=1;i<=11;i++) {
		//i<=6?k++:k--;
		if(i<=5) {
			k++;
		}else {
			k--;
		}
		for(j=1;j<=5;j++) {
			
			if(j>=6-k && j<=5+k) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	
}
 
