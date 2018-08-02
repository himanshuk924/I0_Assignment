package assignment.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordOccuranceAtpos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineNo = 0, check = 1;
		System.out.println("Enter file path");
		
		String path = sc.next();// Enter full path of the file
		System.out.println("Enter the word to search");
		
		String word = sc.next();// Enter word for searching
		File file = new File(path);
		
		try {
			Scanner in = new Scanner(file);
			while (in.hasNext()) {// till last word exist
				lineNo++;// increment the line number
				String line = in.nextLine();// to fetch complete line
				if (line.contains(word)) {
					check = 0;
					System.out.println("line is :" + line + " ------>at line number" + lineNo + "\n");
				}
			}
			if (check == 1) {
				System.out.println("Word not found");
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
