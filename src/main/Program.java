package main;

import utils.MyFile;

public class Program {

	public static void main(String[] args) {
		MyFile myFile = new MyFile("c:\\users\\tidgo\\documentos\\testolino.txt");
		
		myFile.createFile();
		myFile.writeFile("Testing\nlots\nof\nthings!");
		myFile.readFile();
	}

}
