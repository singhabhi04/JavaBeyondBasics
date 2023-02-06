package com.durgasoft.fileio;

import java.io.File;
import java.io.IOException;

public class FileClassMethods {

	public static void main(String[] args) throws IOException {
		File f = new File("fileMethod.txt");
		
		f.exists();// check whether physical file is present.return type boolean
		f.createNewFile();//check whether file is present ,if present return false ,if file is not present it will create and return true.
		
		f.mkdir();////check whether directory is present ,if present return false ,if file is not present it will create and return true.
		f.isFile();// check whether file object represent physical file 
		f.isDirectory();//check whether file object represent  directory.
		f.list();// names of all files and directory inside a directory;
		f.length();//return number of  chacters in a file;
		f.delete();
	}

}
