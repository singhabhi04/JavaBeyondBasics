package com.durgasoft.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConstructors {
/*
 * total 4 constructor ,first two for overide and next two for append.
 * if specified file is not available then this Constructor will create that file. 
 */
	public static void main(String[] args) throws IOException {
		// 1st and 2nd Constructor is used to overide the existing data in file
		File file = new File("demo.txt");
		// 1st constructor
		FileWriter fw = new FileWriter("demo.txt");
		// 2nd constructor
		FileWriter fw1 = new FileWriter(file);
		// 3rd and 4th Constructor will append data to existing file based on boolean
		// append value we pass in parameter.
		// 3Rd Constructor
		FileWriter fw2 = new FileWriter("demo.txt", true);
		// 4th Constructor
		FileWriter fw3 = new FileWriter(file, true);

	}

}
