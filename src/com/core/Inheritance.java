package com.core;

class A {
	String s = null;

	public void setString(String s) {
		this.s = s;
	}

	public void getString() {
		System.out.println(s);
	}
}

class B extends A {
	public void getData() {
		System.out.println("This is class B which is extending the class A");
	}
}

public class Inheritance {
	public static void main(String args[]) {
		B b = new B();
		b.setString("This is class A");
		b.getString();
		b.getData();
	}
}
