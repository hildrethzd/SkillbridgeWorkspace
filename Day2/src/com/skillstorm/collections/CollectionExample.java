package com.skillstorm.collections;

import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		MenuItem salad = new MenuItem("Salad", 10);
		MenuItem pepsi = new MenuItem("Pepsi", 3);
		MenuItem wings = new MenuItem("Chicken Wings", 11);
		
		
		Collection<MenuItem> menu = new ArrayList<>();
		menu.add(salad);
		menu.add(pepsi);
		menu.add(wings);
		
		System.out.println(menu);
		
		// For each loop to iterate through collection
		for(MenuItem m : menu) {
			System.out.println("For Each: " + m);
		}
		
		// Iterator is a cursor that lets us go through the elements 1 at a time
		Iterator<MenuItem> itemIterator = menu.iterator();
		while(itemIterator.hasNext()) {
			MenuItem item = itemIterator.next();
			System.out.println(item);
			if(item.price<10) {
				itemIterator.remove();
			}
		}
		System.out.println("Updated Menu" + menu);
		
		
		System.out.println("Size: " + menu.size());
		System.out.println("Empty: " + menu.isEmpty());
		
		System.out.println("Contains Wings: " + menu.contains(wings));
		System.out.println("Contains Pepsi: " + menu.contains(pepsi));
		
		// Create another collection
		Collection<MenuItem> newMenu = new ArrayList<>();
		// Add all elements from menu to newMenu
		newMenu.addAll(menu);
		System.out.println("New Menu" + newMenu);
		
		
		menu.add(pepsi);
		System.out.println("Menu" + menu);
		
		// REmove all that exist in newMenu from menu
		menu.removeAll(newMenu);
		System.out.println("Menu" + menu);
		
		
		

	}

}
