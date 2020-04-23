import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test33ReadingFiles {

	public static void main(String[] args) throws FileNotFoundException {
		//Can specify full path of the file from drive
		
		//String fileName = "D:\\Attra\\JavaTest\\example.txt";
		
		//Can specify file from your project directcory
		String fileName = "example.txt";
		File textfile = new File(fileName);
		
		Scanner in = new Scanner(textfile);
		
		int value = in.nextInt();
		System.out.println("Read value:" + value);
		
		in.nextLine();
		
		int count = 2;
		
		//to Print contents of the file
		while(in.hasNextLine()) {
			String  line = in.nextLine();
			System.out.println(count+ ":" + line);
			count++;
		}

		in.close();
	}

}
