package com.durgasoft.fileio;

import java.io.File;

public class FileMethodsDemo3 {
/*
 * To display all directory only  in diretcory;
 */
	public static void main(String[] args) {
		int filecount=0;
		File file = new File("durga123");
	String[] files=	file.list();
	for(String s:files) {
		File f1 = new File(file,s);
		if(f1.isDirectory()) {
			System.out.println(s);
			filecount++;
		}
		
	}
System.out.println("Total directory inside directory is "+filecount);
	}

}
