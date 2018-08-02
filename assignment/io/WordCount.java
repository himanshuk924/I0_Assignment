package assignment.io; 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) throws IOException{
			Scanner get=new Scanner(System.in);
			String  path;
			System.out.println("Enter file path");
			
			path=get.next();//Enter full path
			Scanner sc=new Scanner(new FileInputStream(path));
			
			int wordCount=0;//To calculate words
			while(sc.hasNext()) {
				sc.next();
				wordCount++;
			}
			sc.close();
			get.close();
			System.out.println("No. words in file are: "+ wordCount);
		}
		
}
