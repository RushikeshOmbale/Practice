package com.codingpractice.in;

public class RunnableInterfaceExample implements Runnable {

	@Override
	public void run() {
		System.out.println("by using runnable interface we are creating threads");
		
	}
	
	
	public static void main(String[] args) {
		RunnableInterfaceExample r = new RunnableInterfaceExample();
		Thread t = new Thread(r);
		t.start();
		
		
		
	}

}
