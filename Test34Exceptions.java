//Using throws

package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test34Exceptions {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt"); // file"test.txt" is missing it will throow following exception
        // Exception in thread "main" java.io.FileNotFoundException: test.txt (The system cannot find the file specified)
		
		FileReader fr = new FileReader(file);
	
	}

}
