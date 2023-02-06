package com.durgasoft.fileio;

import java.io.File;

public class FileMethodsDemo2 {
/*
 * To display all files in diretcory;
 */
	public static void main(String[] args) {
		int filecount=0;
		File file = new File("durga123");
	String[] files=	file.list();
	for(String s:files) {
		File f1 = new File(file,s);
		if(f1.isFile()) {
			System.out.println(s);
			filecount++;
		}
		
	}
System.out.println("Total files inside directory is "+filecount);
	}

}
