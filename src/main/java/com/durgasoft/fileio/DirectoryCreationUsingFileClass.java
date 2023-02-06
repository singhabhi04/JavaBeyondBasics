package com.durgasoft.fileio;

import java.io.File;

public class DirectoryCreationUsingFileClass {

	public static void main(String[] args) {
		File directory = new File("directorydemo");
		System.out.println(directory.exists());
		directory.mkdir();
		System.out.println(directory.exists());

	}

}
