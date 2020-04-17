import java.util.Scanner;

public class test7UsrInput {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a line of text: ");
		
		//Wait for the user to enter a line of text
		String  line = input.nextLine();
		
		// Display what they entered
		System.out.println("You entered: "+ line);
		
		//Output the prompt
		System.out.println("Enter a Value: ");
		
		//Wait for the user to enter a line of text
		int value = input.nextInt();
		
		// Display what they entered
		System.out.println("You entered: " + value);
		
	}

}
