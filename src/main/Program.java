package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			File myFile = new File("c:\\users\\tidgo\\Documentos\\teste.txt");
			Scanner sc = new Scanner(myFile);

			if (myFile.exists()) {
				System.out.println("File name: " + myFile.getName());
				System.out.println("Can Read? " + myFile.canRead());
				System.out.println("Can write? " + myFile.canWrite());
				System.out.println("Absolute path: " + myFile.getAbsolutePath());

				try {
					System.out.println("Absolute canonical: " + myFile.getCanonicalPath());
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println("Parent? " + myFile.getParent());
				System.out.println("Total Space? " + myFile.getTotalSpace());
				System.out.println("Length? " + myFile.length());
			}

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
