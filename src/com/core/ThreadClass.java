package com.core;

class Multi extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}
}

public class ThreadClass {
	public static void main(String args[]) {
		Multi m = new Multi();
		Thread t = new Thread(m);
		t.start();
	}
}
