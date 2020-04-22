
public class Test26Poly {

	public static void main(String[] args) {
		Test26Plant plant1 = new Test26Plant();
		Test26Tree tree1 = new Test26Tree();
		
		Test26Plant plant2 = plant1;
		plant2.grow();  // output is "Plant is growing" ...grow() is of Test26Plant is invoked
		
		Test26Plant plant3 = tree1;
		plant3.grow();  // output is "Tree is growing" ...grow() is of Test26Tree is invoked
		
		tree1.shedLeaves();
		
		//plant2.shedLeaves();  //Won;t work as shedLeaves() is not of Test26Plant class
		
		doGrow(tree1);
		
	}
	
	public static void doGrow(Test26Plant plant4) {
		plant4.grow();
	}

}
