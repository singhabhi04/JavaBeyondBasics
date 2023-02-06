package com.durgasoft.fileio;

import java.io.File;
import java.io.IOException;

public class FileClassConstructors3 {
	/*
	 * there are 3 constructors in File class. //code to create a directory named
	 * with durga123 in cwd and create a file named with abc.txt in that directory
	 * Below is 3rd constructor
	 */

	public static void main(String[] args) {
		File file = new File("durga3");
		file.mkdir();
		File file1 = new File(file, "abc3.txt");

		try {
			file1.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
