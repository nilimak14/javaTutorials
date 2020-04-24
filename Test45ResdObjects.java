import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test45ResdObjects {

	public static void main(String[] args) {
		System.out.println("Readding  objects...");
		
		try(FileInputStream fi = new FileInputStream("People.bin")){
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Test45Person person1 = (Test45Person)os.readObject();
			Test45Person person2 = (Test45Person)os.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
