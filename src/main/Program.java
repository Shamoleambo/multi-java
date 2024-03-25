package main;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		File myFile = new File("c:\\users\\tidgo\\documentos\\testolino.txt");
		if (myFile.delete()) {
			System.out.println("Successfully deleted the file " + myFile.getName());
		} else {
			System.out.println("Failed to delete the file");
		}
	}

}
