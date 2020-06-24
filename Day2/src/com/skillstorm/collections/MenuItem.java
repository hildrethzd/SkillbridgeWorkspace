package com.skillstorm.collections;

public class MenuItem implements Comparable<MenuItem> {
	String name;
	int price;
	
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}

	@Override
	// Natural order, default order
	public int compareTo(MenuItem another) {
		// this > another = +
		// this < another = -
		// this = another = 0
		
		if(this.price > another.price) return 1;
		else return -1;

	}
	
	
	

}
