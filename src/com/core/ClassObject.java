package com.core;

class Test {
	String s = "This is test class";

	public void getData() {
		System.out.println("This is example of class and object, concepts of core java");
	}
}

public class ClassObject {
	public static void main(String args[]) {
		Test test = new Test();
		test.getData();
		System.out.println(test.s);
		System.out.println("Object of Test class is 'test'");
	}
}
