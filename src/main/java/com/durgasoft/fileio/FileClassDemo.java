package com.durgasoft.fileio;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) {
		File file = new File("FileDemo1.txt"); /*
		Above statement will not create a new file.It will check if file is present or not at the specified location ,
		if it is  present then it will refer to that file.
		
		*/

		System.out.println(file.exists());

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(file.exists());
	}

}
