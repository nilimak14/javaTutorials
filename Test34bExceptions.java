package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test34bExceptions {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file");
		}
		
	}

	public static void openFile() throws FileNotFoundException {
		
		File file = new File("test1.txt");
		FileReader fr = new FileReader(file);
		
	}
}
