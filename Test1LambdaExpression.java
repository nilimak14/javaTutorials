///////Using Lambda Expression i.e. ()->      ///////////////


interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12, 13);
		System.out.println("Return value is: " + value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		int value = e.execute("Hello");
		System.out.println("Return value is: " + value);
	}
}

//() -> System.out.println("Hello there.")

/*
* () -> { System.out.println("This is code passed in a lambda expression.");
* System.out.println("Hello there.");
* 
* }
*/

/*
* () -> { System.out.println("This is code passed in a lambda expression.");
* System.out.println("Hello there."); return 8; }
*/

/*
* () -> { return 8; }
*/

//() -> 8

//(int a) -> 8

/*
(int a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

/*
(a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

/*
*  a -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

/*
(a,b) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
*/

public class Test1LambdaExpression {

	public static void main(String[] args) {
		int c = 100;
		// Mustn't do this: c = 8;
		
		int d = 77;

		////////// Without using Lambda expression////////////
		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				// Can do this in methods of anonymous classes int d = 8;
				return a + b + c;
			}
		});

		System.out.println("======================");

		//////////Using Lambda expression//////////
		runner.run( (a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		});
		
		System.out.println("======================");
		
		Executable ex = (a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		
		runner.run(ex);
		
		Object codeblock = (Executable)(a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		
		

	}
}
