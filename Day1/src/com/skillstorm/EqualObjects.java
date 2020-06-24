package com.skillstorm;

public class EqualObjects {

	public static void main(String[] args) {
		
		boolean result = false;
		Salad chickenSalad = new Salad("Chicken Salad", "Chicken", 300);
		Salad chickenSalad2 = new Salad("Chicken Salad", "Chicken", 500);
		
		result = chickenSalad.equals(chickenSalad2);
		System.out.println(result);
		System.out.println(chickenSalad.hashCode());
		System.out.println(chickenSalad2.hashCode());
	}

}

class Salad {
	String name;
	String protein;
	int calories;
	public Salad() {
		super();
	}
	
	public Salad(String name, String protein, int calories) {
		super();
		this.name = name;
		this.protein = protein;
		this.calories = calories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((protein == null) ? 0 : protein.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salad other = (Salad) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (protein == null) {
			if (other.protein != null)
				return false;
		} else if (!protein.equals(other.protein))
			return false;
		return true;
	}

	
	
	
	
	
}
