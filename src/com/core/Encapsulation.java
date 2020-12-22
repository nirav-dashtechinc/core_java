package com.core;

class Capsule {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		Capsule cap = new Capsule();
		cap.setName("Encapsulation example");
		System.out.println(cap.getName());
	}
}
