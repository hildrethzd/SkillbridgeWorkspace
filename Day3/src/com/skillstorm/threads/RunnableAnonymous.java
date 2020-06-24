package com.skillstorm.threads;

import java.util.ArrayList;
import java.util.List;

public class RunnableAnonymous {

	public static void main(String[] args) throws InterruptedException {
		
		List<Thread> threads = new ArrayList<>();
		
		for(int i =0; i< 3; i++) {
			threads.add(new Thread(new Runnable() {				
				public void run() {
					for(int i=0; i< 5; i++) {
						System.out.println(Thread.currentThread().getName() + " Count: " + i);
					}
				}
			}
			));
		}
		
		for(int i =0; i< 3; i++) {
			threads.get(i).start();
			threads.get(i).join();
		}
		
		
	}

}
