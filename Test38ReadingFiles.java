import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test38ReadingFiles {

	public static void main(String[] args) {
		File file = new File("test.txt");
		BufferedReader br = null;
		try {
			FileReader fileR = new FileReader(file);
			br = new BufferedReader(fileR);

			String line;

			// line = br.readLine(); //Reads only first line of the file

			// To read all lines of the file we will use while loop

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}

		// lets put below try..code in Finally, so that if exception occurs or not
		// above,
		// this code will be executed
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// no need to specify any output
				// System.out.println("NullPointerException: " + file.toString());
			}
		}

	}

}
