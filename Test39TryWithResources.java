//AutooCloseable is class within Java which has Close method
class Temp implements AutoCloseable { 

	@Override
	public void close() throws Exception {
		System.out.println("Closing..");
		
	}
	
}

public class Test39TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Temp temp1 = new Temp();
		
		try {
			temp1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      */
	
	// will do same above code using Try with resources
		
		try(Temp temp1 = new Temp()){  // Try using resources
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
