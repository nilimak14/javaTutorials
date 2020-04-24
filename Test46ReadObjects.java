import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test46ReadObjects {

	public static void main(String[] args) {
		System.out.println("Readding  objects...");

		try (FileInputStream fi = new FileInputStream("People.bin")) {
			ObjectInputStream os = new ObjectInputStream(fi);
            Test46Person[] people = (Test46Person[])os.readObject();
            //Using  ArrayList
            
            ArrayList<Test46Person> peoplelist = (ArrayList<Test46Person>)os.readObject();
            
            for(Test46Person person: people) {
            	System.out.println(person);
            }
            
            System.out.println();
            
            System.out.println("Using ArrayList\n");
            
            for(Test46Person person: peoplelist) {
            	System.out.println(person);
            }
            
            System.out.println();
            
            int num = os.readInt();
            for (int i=0;i<num;i++) {
            	Test46Person person = (Test46Person)os.readObject();
            	System.out.println(person);
            }
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
