package com.core;

class Aa {
	public void getData(String s) {
		System.out.println("This is class A and s: " + s);
	}
}

class Bb extends Aa {
	public void getData(String s) {
		System.out.println("This is class B and s: " + s);
	}
}

public class DynamicPolymorphism {
	public static void main(String args[]) {
		Aa a = new Bb();
		a.getData("car");

		a = new Aa();
		a.getData("bike");
	}
}
