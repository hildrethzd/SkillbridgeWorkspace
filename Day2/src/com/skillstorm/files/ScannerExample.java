package com.skillstorm.files;

import java.util.Scanner;

public class ScannerExample {
	
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Entered name: " + name);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		System.out.println("Entered number: " + number);
		
		input.close();
		input2.close();
		 
	}
}
