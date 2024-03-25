package main;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		String qqr = "Mano do Ceu";
		String[] arr = qqr.split("");
		String newStr = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			newStr += arr[i];
		}

		System.out.println(newStr);
	}

}
