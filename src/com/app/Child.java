package com.app;

public class Child extends Parent {
	public void m1() {
		System.out.println("child class");
	}
public static void main(String[] args) {
	Parent p=new Child();
	Child c=new Child();
	p.m1();
	c.m1();
}
}
