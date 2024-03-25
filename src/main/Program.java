package main;

import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:\\users\\tidgo\\documentos\\testolino.txt");

			fw.write("I wanna write files all day my dude!");
			fw.close();
		} catch (IOException e) {

		}

	}

}
