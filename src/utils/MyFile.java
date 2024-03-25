package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {

	private String path;
	private File myFile;

	public MyFile(String path) {
		this.path = path;
		this.myFile = new File(path);
	}

	public void createFile() {
		try {
			if (this.myFile.createNewFile()) {
				System.out.println("File created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile(String content) {
		try {
			FileWriter fw = new FileWriter(this.path);
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFile() {
		try {
			Scanner sc = new Scanner(this.myFile);

			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void deleteFile() {
		if (myFile.delete()) {
			System.out.println("File deleted");
			myFile = null;

		} else {
			System.out.println("File couldn't be deleted");
		}
	}

	public String getPath() {
		return this.path;
	}
}
