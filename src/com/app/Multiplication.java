package com.app;

public class Multiplication {
public static void main(String[] args) {
  int n=153,r;
  int sum=0;
  int original=n;
	
	while(n!=0) {
		System.out.println(n);
		r=n%10;
		//System.out.println(r);
		n=n/10;
		sum=sum+r*r*r;
	
	}
	//System.out.println(sum);
	//System.out.println(n);
	if(sum==original) {
	System.out.println("given no is armstrong");
	}
	else {
		System.out.println("not armstrong");
	}

}
}
