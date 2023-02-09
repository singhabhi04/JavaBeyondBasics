package com.durgasoft.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class MethodsinFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("filewrite.txt");
		// fw.write('a');// file.write(int ch) to write a single chatcter
		fw.write("writing in file");
		fw.flush();// after write mmethod we need flush method mandatory
		fw.close();
	}

}
