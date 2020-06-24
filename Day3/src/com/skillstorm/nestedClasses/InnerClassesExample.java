package com.skillstorm.nestedClasses;

import com.skillstorm.nestedClasses.Outer.StaticClass;

public class InnerClassesExample {
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.printCompInfo();
		
		Computer.Screen screen = comp.new Screen();
		screen.printScreenInfo();
		
		Computer.Screen screen2 = new Computer().new Screen();
		
		// Anonymous
		Computer comp2 = new Computer() {
			public void printCompInfo() {
				System.out.println("Year from ANONYMOUS: "+ getYear());
			}
		};
		comp2.printCompInfo();
		comp.printCompInfo();
		
		Laptop l = new Laptop() {
			public void printInterface() {
				System.out.println("Year from ANONYMOUS INTERFACE: ");
			}			
		};
		l.printInterface();
		
		// Local Inner Class
		Outer o = new Outer();
		o.run();
		//Object ob = o.run();
		
		
		// static
		StaticClass sc = new StaticClass();
		sc.printStatic();
		
	}

}

class Computer {
	private int year = 2020;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printCompInfo() {
		System.out.println("Year from OUTER: "+ year);
	}
	
	class Screen {
		public void printScreenInfo() {
			System.out.println("Year from INNER: "+ year);
		}
	}
}

class Outer {
	int outerVar = 100;
	static int staticOuterVar = 100;

	
	Object run() {
		class LocalClass{
			void displayLocal() {
				System.out.println("Hello from local class");
				System.out.println("Hello from local class: "+ staticOuterVar);
			}
		}
		
		LocalClass local = new LocalClass();
		local.displayLocal();
		return local;
	}
	
	static class StaticClass{
		void printStatic() {
			System.out.println("Hello from static class");

		}
	}
}

interface Laptop{
	void printInterface();
}
