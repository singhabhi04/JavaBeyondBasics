package com.durgasoft.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		char[] ch = new char[(int) file.length()];
		fr.read(ch);

		for (char ch1 : ch) {
			System.out.print(ch1);
		}
		fr.close();
	}
}
