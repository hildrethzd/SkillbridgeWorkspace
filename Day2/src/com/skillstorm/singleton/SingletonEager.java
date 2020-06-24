package com.skillstorm.singleton;

public class SingletonEager {
	
	// 1. Make constructor private	
	private SingletonEager() {
		// ....... doing some heavy stuff..reading a lot of data
	}
	
	// 2. create private final instance
	private final static SingletonEager EAGER_SINGLETON = new SingletonEager();

	
	// 3. getInstance() method return EAGER_SINGLETON instance we created
	public static SingletonEager getInstance() {
		return EAGER_SINGLETON;
	}
}
