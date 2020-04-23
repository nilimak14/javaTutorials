// Tutorial 38 - Reading files with fileReader makes  simpler with this Tutorial
// Same code is used ass that of  Tutorial 38 - Test38ReadingFiles

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test39aTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("test.txt");
		/*
		 * FileReader fr = new FileReader(file1); BufferedReader br = new
		 * BufferedReader(fr);
		 */
		// Can be achieved as below also:
		// BufferedReader br = new BufferedReader(new FileReader(file1));
		// we can use Try with Resources now

		try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't find file: " + file1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read: " + file1.toString());
		}

	}

}
