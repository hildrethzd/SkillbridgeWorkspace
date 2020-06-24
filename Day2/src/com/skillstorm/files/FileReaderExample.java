package com.skillstorm.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException{
		
		File file = new File("FileReader.txt");
		char[] text = new char[100];
		
		try(FileReader fr = new FileReader(file)) {
			fr.read(text);
			System.out.println(text);
		}
		catch (IOException e) {
			System.out.println("Something is wrong");
		}
		
		try(FileReader fr = new FileReader(file)) {
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
				
		}
		catch (IOException e) {
			System.out.println("Something is wrong 2");
		}
	}
	}


