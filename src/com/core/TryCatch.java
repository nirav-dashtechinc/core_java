package com.core;

public class TryCatch {
	public static void main(String args[]) {
		try {
			int i = (0 * 11) / 0;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}

		finally {
			System.out.println("This is finally block");
		}
	}
}
