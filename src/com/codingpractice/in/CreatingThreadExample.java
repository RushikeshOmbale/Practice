package com.codingpractice.in;

public class CreatingThreadExample extends Thread {

	public void run() {
		System.out.println("thread is started");
		System.out.println("threaad is finished");

	}

	public static void main(String[] args) throws InterruptedException {
		Thread T = new CreatingThreadExample();
		T.start();

		Thread T1 = new CreatingThreadExample();
		T1.start();

	}
}
