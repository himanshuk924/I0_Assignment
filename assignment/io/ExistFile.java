package assignment.io;

import java.io.File;
import java.util.Scanner;

public class ExistFile {

	public static void main(String[] args) {
		String filePath;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file destination");
		
		filePath = sc.next();//Enter Full path of the file
		File f = new File(filePath);
		
		if (f.exists()) {//if file exists
			System.out.println("File do exist at that path");
		} else {
			System.out.println("File do not exit");
		}
		sc.close();
	}
}
