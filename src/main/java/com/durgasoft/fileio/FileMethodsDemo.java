package com.durgasoft.fileio;

import java.io.File;

public class FileMethodsDemo {
/*
 * To display all files and directory in diretcory;
 */
	public static void main(String[] args) {
		int filecount=0;
		File file = new File("durga123");
	String[] files=	file.list();
	for(String s:files) {
		
		System.out.println(s);
		filecount++;
	}
System.out.println("Total file and dir are "+ filecount);
	}

}
