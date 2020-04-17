
public class test11ArrayString {

	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "grapes", "banana", "mango"};
		for( String fruit: fruits) {
			System.out.println(fruit);
		}
//more way to define string
		String text = null; //its value is null that is nothing
		System.out.println(text); //will print null that is nothing
		
		String[] texts = new String[2];
		System.out.println(texts[0]);//will print  null as texts[0] is not yet initialized
		
		texts[1] = "nilima";
		System.out.println(texts[1]); // will print nilima
		
	}

}
