package com.durgasoft.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("filewriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c','d' };
		bw.write(ch);
		bw.newLine();
		bw.write("durga");

		bw.write("Software Solutions");
		bw.flush();
		bw.close();

	}

}
