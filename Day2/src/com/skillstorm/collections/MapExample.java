package com.skillstorm.collections;

import java.util.*;


public class MapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map);
		System.out.println(map.get(2));
		map.remove(3);
		System.out.println(map);
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer key =  itr.next();
			System.out.println("Key: "+ key + " Value: "+ map.get(key));
		}
		
		
		for(Object key : map.keySet()) {
	        System.out.println("For Each: " + map.get(key));
		}
		
		Map<Integer, String> mapB = new HashMap<Integer, String>();
		mapB.putAll(map);
		System.out.println("MapB: "+mapB);
		
		
		System.out.println("Contains Key: " + mapB.containsKey(3));
		System.out.println("Contains Value: " + mapB.containsValue("B"));
 
		
		// TreeMap - key value pairs in a sorted order
		TreeMap<Integer, String> treemap = new TreeMap<>();
		treemap.put(1, "B");
		treemap.put(3, "C");
		treemap.put(2, "A");
		
		System.out.println("Tree Map: " + treemap);
		
		//LinkedHashMap - maintains insertion order
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.putAll(treemap);
		System.out.println("Linked Hash Map: " + lhm);
		
		
		
		
	}
	
	

	

}
