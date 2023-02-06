package com.durgasoft.fileio;

import java.io.File;
import java.io.IOException;

public class FileClassConstructors {
	
	/*
	 * there are 3 constructors in File class.
	 * //this code  will create a file named with demo.txt in current working directory.
	 * Below is 1st constructor
	 */

	public static void main(String[] args) {
		File file = new File("demo.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
