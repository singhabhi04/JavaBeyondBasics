package com.durgasoft.printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintwriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("printwrite.txt");
		pw.write(100);
		pw.println(100);
		pw.println(false);
		pw.println('c');
		pw.println("durga");
		pw.flush();
		pw.close();

	}

}
