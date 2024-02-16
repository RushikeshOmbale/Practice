package com.multithreadinexample.in;

public class SleepMethodExample implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : Value of i = " + i);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		//SleepMethodExample s = new SleepMethodExample();
		Thread t = new Thread(new SleepMethodExample());
		Thread t1 = new Thread(new SleepMethodExample());
		
		t.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception caught");
		}
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		
		

		
	}

}
