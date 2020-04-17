import java.util.Scanner;

public class test8dowhileLoop {

	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter  a number: ");
			value = input.nextInt();
		}
		while(value!=5);
		
		System.out.println("Got 5");

	}

}
