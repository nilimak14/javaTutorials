import java.util.Scanner;

public class test9switch {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a cocmmand");
		String text = input.nextLine();
		switch(text) {
		case  "start":
			System.out.println("Machine is started");
		    break;
		case "stop":
			System.out.println("Machine is stopped");
			break;
		default:
			System.out.println("Command not recognized");
		}

	}

}
