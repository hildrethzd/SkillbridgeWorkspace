package com.skillstorm.threads;

// 1. Extends Thread
public class ThreadExample extends Thread{

	public void run() {
		System.out.println("Inside Run Method: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main Method: " + Thread.currentThread().getName());
		
		Thread thread = new ThreadExample();
		thread.start();
		
		Thread thread2 = new ThreadExample();
		thread2.start();
		
	}

}
