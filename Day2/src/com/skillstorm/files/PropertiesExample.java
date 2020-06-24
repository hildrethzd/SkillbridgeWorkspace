package com.skillstorm.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	
	Properties properties = new Properties();

	PropertiesExample (){
		properties.setProperty("email", "5@5.com");
		
		try {
			properties.load(new FileInputStream("application.properties"));
		}
		catch(IOException e) {
			System.out.println("Something is wrong");
		}
	}

	public static void main(String[] args) {
		
		PropertiesExample example = new PropertiesExample();
		System.out.println(example.properties.getProperty("name"));
		System.out.println(example.properties.getProperty("city"));
		
		// access property not from the file
		System.out.println(example.properties.getProperty("email"));


		

	}

}
