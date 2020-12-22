package com.core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingData {

	public static void main(String args[]) throws IOException {
		// Write data to the file
		FileWriter fw = new FileWriter("D:\\demo file.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		pw.println("this things will be added to 1st line");
		pw.println("this things will be added to 2st line");
		pw.close();
	}
}
