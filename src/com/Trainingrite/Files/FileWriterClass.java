package com.Trainingrite.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) {
		// 1. Define the file (path) that we want to write to
		String filename = "C:\\Users\\shokoohi\\eclipse-workspace\\New folder\\JavaTutorials\\TestOutput.txt";
		String myMessage = "This will be placed inside the file.xxxxxxx";
		
		// 2. Create the file in java
		System.out.println("Creating the file to write...");
		File file = new File(filename);
		
		// 3. Open the file
		System.out.println("Opening the file...");
		try {
			FileWriter fw = new FileWriter(file);
			
		// 4. Writing to the file
			System.out.println("Writing the file...");
			fw.write(myMessage);
			
		// 5. Close the file resource
			System.out.println("Closing the file...");
			fw.close();
		}	
		catch (FileNotFoundException e) {
			System.out.println("ERROR: FILE NOT FOUND");
			System.out.println(e.toString());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			//e.printStackTrace();
		} finally {
			System.out.println("Finished the writing to file...");
		  }
			
		System.out.println("Program is closing");
			
				
	}

}
