package com.skillstorm.threads;

public class RunnableExample implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside Main Method: " + Thread.currentThread().getName());
		
		RunnableExample runnable = new RunnableExample();
		
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		
		thread.start();
		thread.join();
		thread2.start();
		// thread2.join();
		thread3.start();

	}

	@Override
	public void run() {
		for(int i=0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i: " + i);
		}
	}

}
