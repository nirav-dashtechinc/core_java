package com.core;

class Multi1 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running...");
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Thread t = new Thread(m1);
		t.start();
	}
}
