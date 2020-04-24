import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test47ReadObjects {

	public static void main(String[] args) {
		System.out.println("Readding  objects...");

//		try (FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {
// above try line can be also written as
			try ( ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {
			Test47Person person1 = (Test47Person) os.readObject();
			System.out.println(person1);

			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
