package com.skillstorm;

public class VariablesExample {
	public static void main(String[] args) {
		Variable v = new Variable();
		Variable v2 = new Variable();
		System.out.println(v.getAge());
		System.out.println(v.name);
		System.out.println(Variable.year);
		
		v.show();
		v.name = "Tommy";
		v.show();
		v2.show();
		
		v.showLocalVar();
		v.showLocalVar("Sending local...");
		v.showLocalVar(100);
		
		v.showLocalVar();
	
	}

}

class Variable {
	public static int year = 2020;
	
	private int age = 65;
	public String name = "John";
	       String lastName = "Johnson";
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("Var Name: " + name);
	}
	
	public void showLocalVar() {
		String localVar = "Local";
		
		if(localVar.equals("Local")) {
			String blockVar = "Block";
			System.out.println("Block Var: " + blockVar);
			}
		
	}
	
	public void showLocalVar(String val) {		
		System.out.println("OVERLOADED Local Var: " + val);
	}
	
	public void showLocalVar(int val) {		
		System.out.println("INTEGER OVERLOADED Local Var: " + val);
	}
	
	
	
}
