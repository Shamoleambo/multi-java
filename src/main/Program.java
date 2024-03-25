package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			File myFile = new File("c:\\users\\tidgo\\Documentos\\tete.txt");
			Scanner sc = new Scanner(myFile);

			Map<String, Integer> people = new HashMap<String, Integer>();
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] dataSplit = data.split(",");

				people.put(dataSplit[0], Integer.parseInt(dataSplit[1]));
			}

			sc.close();
			people.forEach((name, age) -> {
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println();
			});
		} catch (FileNotFoundException e) {
			throw new ReadException("Something went wrong with the file reading fun process");
		}

	}

}
