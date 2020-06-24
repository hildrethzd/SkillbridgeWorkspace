package com.skillstorm.threads;

public class DeadLock {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo2 t2 = new ThreadDemo2();
		t1.start();
		t2.start();

	}
	
	private static class ThreadDemo extends Thread {
		public void run() {
			synchronized(Lock1) {
			System.out.println("Thread 1: Holding lock 1");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			synchronized(Lock2) {
			System.out.println("Thread 1: Holding lock 1 and 2");
			}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized(Lock2) {
			System.out.println("Thread 2: Holding lock 2");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			synchronized(Lock1) {
			System.out.println("Thread 2: Holding lock 1 and 2");
			}
			}
		}
	}

}
