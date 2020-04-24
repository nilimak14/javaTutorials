import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test47WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

//		try (FileOutputStream fs = new FileOutputStream("test.ser");
//				ObjectOutputStream os = new ObjectOutputStream(fs)) {

			try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
			Test47Person person1 = new Test47Person(3, "Neha");
			Test47Person.setCount(88);

			os.writeObject(person1);

			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
