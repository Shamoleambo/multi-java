package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("c:\\users\\tidgo\\documentos\\testolino.txt"));
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}

}
