package com.skillstorm.collections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("b");
		q.add("a");
		q.add("c");
		
		System.out.println(q);
		
		// top element
		System.out.println(q.peek());
		
		// print top and remove
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
