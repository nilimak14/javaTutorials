
public class test12multiArray {

	public static void main(String[] args) {
		// one dimensional array
		int[] values = {3,4,235};
		System.out.println(values[2]); // will print 235
		
		// multi dimensional aaray here we are using 2 dimensional array
		
		int[][] grid = {
			{ 2, 3, 6},
			{4,5},
			{24,5 ,6,235}
		};

		System.out.println(grid[0][2]); //will print 8
		System.out.println(grid[1][1]);//will print 5
		System.out.println(grid[2][3]); //will print 235
		
		String[][] texts = new String[2][3];
		texts[0][2] = "Hi Nilima";
		System.out.println(texts[0][2]); // will print  "Hi Nilima"
		
		// Lets print values of array grid from above using For loop
		
		for ( int row = 0; row<grid.length; row++) {
			for ( int col =0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
	
	//Some more way to define multi dimensional arrays
	
	String[][] words = new String[2][]; 
	System.out.println(words[0]); // will print null as not yet initialized
	
	// now we will setup sub-array one by one
	words[0] = new String[3];
	words[0][2] = "Hi Jack";
	System.out.println(words[0][2]); // will print "Hi Jack"

	}

}
