package main;

import java.io.File;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		try {
			File myFile = new File("c:\\users\\tidgo\\Documentos\\testolino.txt");
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File Already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
