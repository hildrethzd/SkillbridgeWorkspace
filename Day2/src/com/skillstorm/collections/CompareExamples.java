package com.skillstorm.collections;

import java.util.*;

public class CompareExamples {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		words.add("dog");
		words.add("sky");
		words.add("house");
		words.add("city");
		
		Collections.sort(words);		
		System.out.println(words);
		
		// Built in Comparator
		words.sort(Comparator.reverseOrder());
		System.out.println(words);
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<MenuItem> items = new ArrayList<>();
		MenuItem salad = new MenuItem("Salad", 10);
		MenuItem fanta = new MenuItem("Fanta", 3);
		MenuItem chops = new MenuItem("Lamb Chops", 27);
		
		items.add(salad);
		items.add(fanta);
		items.add(chops);
		
		// Used default order 
		Collections.sort(items);
		System.out.println(items);
		
		
		// Creating comparator when we don't want to change an original class
		Comparator<MenuItem> com = new Comparator<MenuItem>() {			
			@Override
			public int compare(MenuItem item1, MenuItem item2) {
				return item1.name.compareTo(item2.name);
			}
		};
		
		Collections.sort(items, com);
		System.out.println(items);
		
		
		
	}
	
}
