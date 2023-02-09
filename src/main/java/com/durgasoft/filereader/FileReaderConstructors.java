package com.durgasoft.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderConstructors {
/*FileReader is used to read data character by character from file
 * 2 constructor
 */
	public static void main(String[] args) throws IOException {
		 FileReader fr = new FileReader("abc.txt");// 1st constructor
		// File f = new File("abc.txt");
	//	 FileReader fr1 = new FileReader(f);//2nd constructor
		 
		 fr.read();//Reads a single character and returns(int) its unicode value
	fr.close();
		 

	}

}
