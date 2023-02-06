package com.durgasoft.fileio;

import java.io.File;
import java.io.IOException;

public class CreatingaFileAtParticularPath {
	/*
	 * This code is used to create a file at a particular file location
	 */

	public static void main(String[] args) {
		File file = new File("C:\\Data\\Test Automation\\JavaBeyondBasics\\src\\test\\resources","demo.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
