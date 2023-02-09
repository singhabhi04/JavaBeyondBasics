package com.durgasoft.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");//if you want to overide
	//	FileWriter fw = new FileWriter("abc.txt",true);  //if you want to append
		fw.write(100);
		fw.write("urga\nSoftwareSolutions");
		fw.write('\n');
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();

	}

}
