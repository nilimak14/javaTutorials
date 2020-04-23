import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test40WritingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("test.txt");
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file1))) {
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("Last line");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read: " + file1.toString());
		}

	}

}

/*
New file "test.txt" is created in Project folder. If we want different path then we can specify that
This test.txt file contains following data:

This is line one
This is line two
Last line

*/