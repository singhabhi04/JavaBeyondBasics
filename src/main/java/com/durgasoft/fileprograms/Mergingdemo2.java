package com.durgasoft.fileprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Mergingdemo2 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader brfile1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader brfile2 = new BufferedReader(new FileReader("file2.txt"));
		String line1 = brfile1.readLine();
		String line2 = brfile2.readLine();
		while ((line1 != null) || (line2 != null)) {
			if (line1 != null) {
				pw.println(line1);
				line1 = brfile1.readLine();
			}
			if (line2 != null) {
				pw.println(line2);
				line2 = brfile2.readLine();
			}

		}
		pw.flush();
		brfile1.close();
		brfile2.close();
		pw.close();
	}

}
