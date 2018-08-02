package assignment.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class CountLine {

	public static void main(String[] args) throws IOException {
		String path;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file path");
		
		path = sc.next();// Enter Full path of the file
		File f = new File(path);
		
		FileReader fReader = new FileReader(path);// Instantiate FileReader
		if (f.exists()) {
			LineNumberReader lnr = new LineNumberReader(fReader);// Instantiate LineNumberReader
			while (lnr.readLine() != null) {// till reach the last line which is null
			}
			System.out.println("Number of line in file - " + lnr.getLineNumber());
			lnr.close();
		} else {
			System.out.println("File does not exist");
		}
		sc.close();
		fReader.close();
	}
}
