package com.skillstorm.threads;

public class AnonAndLambda {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int a = 0;
				while(a < 5) {
					System.out.println("Hello " + Thread.currentThread().getName());
					a++;
				}
			}		
		});		
		thread.start();
		
		
		// Java 8 - Lambda functions
		// () -> {// overriding run method}
		// (b) -> {}
		Thread thread2 = new Thread(() -> {
			int a = 0;
			while(a < 5) {
				System.out.println("Hello " + Thread.currentThread().getName());
				a++;
			}
		});
		thread2.start();

	}

}
