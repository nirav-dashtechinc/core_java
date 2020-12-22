package com.core;

class Addition {
	public int add(int x, int y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public int add(double x, int y) {
		return (int) x + y;
	}

	public int add(int x, double y) {
		return x + (int) y;
	}
}

public class StaticPolymorphism {
	public static void main(String args[]) {
		Addition add = new Addition();

		System.out.println(add.add(2, 3, 4)); // method 2 called
		System.out.println(add.add(2, 3.4));  // method 4 called
		System.out.println(add.add(2, 3));    // method 1 called
		System.out.println(add.add(2.5, 3));  // method 3 called
	}
}
