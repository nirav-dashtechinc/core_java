package com.core;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Goat extends Animal {
	public void animalSound() {
		System.out.println("The goat says: mee mee");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Animal a = new Goat();
		a.animalSound();
		a.sleep();
	}
}
