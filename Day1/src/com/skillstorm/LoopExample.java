package com.skillstorm;

public class LoopExample {

	public static void main(String[] args) {		
		LoopExample lp = new LoopExample();
		lp.dowhile();
		lp.switches("A");
		lp.loops();
		lp.tern();
		lp.prepost();
		lp.ifs();
	}
	
	
	public void dowhile() {
		System.out.println("************ DOWHILE *****************");
		
		int x = 5;
		
		while (x <= 5) {
			System.out.println(" While: " + x++);
		}	
		
		do {
			System.out.println(" Do: " + x);
		} while (x < 5);
	}
	
	public void switches(String choice) {
		System.out.println("************ SWITCHES *****************");
		switch(choice) {
		case "A": {
			System.out.println("A");
			break;
		}
		case "B": {
			System.out.println("B");
			break;
		}
		default: {
			System.out.println("C");
		}
		}
		
		
		/* integers, convertible integers (byte, short, char), strings, enums
		 * long choice2 = 2L;	
		 * switch(choice2) {
				case "1": {
						System.out.println("1");
						break;
				}
				case "2": {
						System.out.println("2");
			
				}
				default: {
						System.out.println("3");
				}
				}
		 */
	}
	
	
	public void loops() {
		System.out.println("************ FOR LOOPS *****************");
		int[] numbers = {1,5,3};
		
		// size() - find size of ArrayLists
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("************ FOR EACH *****************");
		// el is block var
		for(int el : numbers) {
			System.out.println(el);
		}
	}
	
	/*
	 * Ternary Operator
	 * (?)  - represents if statement
	 * (:) - represents else statement
	 */
	public void tern() {
		System.out.println("************ TERNARY *****************");
		int x = 16;
		
		// if(x > 5) System.out.println("x > 5");
		// else System.out.println("x <= 5");
		
		if(x > 5) {
			if(x > 6) {
				System.out.println("If Inner");
			} else System.out.println("Else Inner");
		}else  System.out.println("Else Outer");
		
		
		
		
		String msg = "";
		msg = (x > 5) ? "x > 5" : "x <= 5";
		System.out.println(msg);
		
		// Nested ternary
		System.out.println("************ TERNARY NESTED *****************");
		int y  = x < 0 ? x > 5 ? 1 : 2 : 3;
		int z = x > -1 ? x > 6 ? x > 10 ? 5 : 4 : 7 : 9;
		System.out.println(z);
	}
	
	public void prepost() {
		System.out.println("************ PRE POST *****************");
		int x = 0;
		System.out.println("1: " + x++);
		System.out.println("2: " + x);
		System.out.println("3: " + --x);
		System.out.println(x++ + ++x + --x - x--); // 0 + 2 + 1 - 1 = 2
	}
	
	public void ifs(){
		System.out.println("************  IF *****************");
		boolean val = true;
		int x = 0;
		
		// OR : true if there is at least 1 true
		// AND : true if everything is true
		
		if(val || ++x > 0) {
			System.out.println("TRUE: x = " +x);
		} else System.out.println("FALSE: x= " +x);
	
	}
	
	

}