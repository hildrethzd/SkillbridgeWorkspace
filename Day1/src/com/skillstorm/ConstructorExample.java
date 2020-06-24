package com.skillstorm;

public class ConstructorExample {

	public static void main(String[] args) {
		Child child = new Child("Thompson");
		child.printName();

	}

}
// first line : super() or this()
class Parent {
	String lastName;
	
	public Parent(String ln) {
		lastName = ln;
	}
	public Parent() {
		
	}
	
	public void printName() {
		System.out.println("Last Name: " + lastName);
	}
}

class Child extends Parent{	
	public Child (String ln) {
		this();
		lastName = ln;
	}
	
	public Child() {
		
	}
}
