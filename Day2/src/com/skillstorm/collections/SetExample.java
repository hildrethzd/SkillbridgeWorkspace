package com.skillstorm.collections;

import java.util.*;

public class SetExample {

		// HashSet, TreeSet
	public static void main(String[] args) {
			
		Set<MenuItem> items = new HashSet<>();
		
		MenuItem taco = new MenuItem("Taco", 9);
		MenuItem tea = new MenuItem("Tea", 3);
		MenuItem salad = new MenuItem("Salad", 10);
		
		items.add(taco);
		items.add(tea);
		items.add(salad);
		
		System.out.println(items);
		
		items.remove(taco);
		System.out.println(items);
		
		List<MenuItem> list = new ArrayList<>();
		list.addAll(items);
		System.out.println("List: " + list);
		
		
		SortedSet<MenuItem> menuItems = new TreeSet<>();
		menuItems.add(salad);
		menuItems.add(tea);
		menuItems.add(taco);
		
		System.out.println("Menu Items: "+menuItems);
		System.out.println("First: " + menuItems.first());
		System.out.println("Last: " + menuItems.last());
		
		// Creating comparator when we don't want to change an original class
		Comparator<MenuItem> com = new Comparator<MenuItem>() {			
			@Override
			public int compare(MenuItem item1, MenuItem item2) {
				if(item1.price > item2.price) return -1;
				else return 1;
			}
		};
		
		SortedSet<MenuItem> menuItems2 = new TreeSet<>(com);
		menuItems2.add(salad);
		menuItems2.add(tea);
		menuItems2.add(taco);
		
		System.out.println("menuItems2: " + menuItems2);
		
		// Creating comparator when we don't want to change an original class
		Comparator<MenuItem> com2 = new Comparator<MenuItem>() {			
			@Override
			public int compare(MenuItem item1, MenuItem item2) {
				return item1.name.compareTo(item2.name);
			}
		};
		
		TreeSet<MenuItem> menuItems3 = new TreeSet<>(com2);
		menuItems3.add(taco);
		menuItems3.add(tea);
		menuItems3.add(salad);
		System.out.println("menuItems3: " + menuItems3);


	}

}
