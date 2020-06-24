package com.skillstorm.singleton;

public class SingletonLazy {

	// 1. Make constructor private	
	private SingletonLazy() {}
	
	/* 2. Make a private static instance of
	 the singleton class. DO NOT INSTANTIATE IT.
	 NOT FINAL, we want to initialize it later;*/
	 
	private static SingletonLazy LAZY_SINGLETON;
	
	/*  3. Write a getInstance() static method that checks our instance. 
	 * if 2 threads try to initialize the Singleton class, we need
	 * synchronized keyword.
	 
	 */
	
	public static SingletonLazy getInstance() {
		if(LAZY_SINGLETON == null) {
			synchronized (SingletonLazy.class) {
			LAZY_SINGLETON = new SingletonLazy();
			}
		}
		
		return LAZY_SINGLETON;
		
		
	}
	
	 
}
