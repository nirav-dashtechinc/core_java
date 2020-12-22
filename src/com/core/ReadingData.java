package com.core;

import java.io.FileReader;

public class ReadingData {

	public static void main(String args[]) {

		// Reading data from the file
		try {
			int i;
			FileReader fr = new FileReader("D:\\demo file.txt");
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		}
		catch (Exception e) {
			System.out.println("Error reading data: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
