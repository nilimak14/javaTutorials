import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test46WriteObject {

	public static void main(String[] args) {
		System.out.println("Writing g objects...");
		
		Test46Person[] people  = {new Test46Person(23,"Neha") , new Test46Person(34,"Myra"), new Test46Person(34,"Kyra")};
		
		//Using  Arrays List
		ArrayList<Test46Person> peoplelist = new ArrayList<Test46Person>(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("People.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);	
			
			os.writeObject(peoplelist);
			
			os.writeInt(peoplelist.size());
			
			for(Test46Person person:peoplelist) {
				os.writeObject(person);
			}
			
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
