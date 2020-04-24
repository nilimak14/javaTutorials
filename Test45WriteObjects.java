import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test45WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing g objects...");
		
		Test45Person person1 = new Test45Person(3,"Neha");
		Test45Person person2 = new Test45Person(5,"Naira");
		System.out.println(person1);
		System.out.println(person2);
		
		try(FileOutputStream fs = new FileOutputStream("People.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(person1); // will give ava.io.NotSerializableException if Test45Person class
			                         // is not serialized
			os.writeObject(person2);
			
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
