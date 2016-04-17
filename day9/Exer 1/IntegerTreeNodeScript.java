
public class IntegerTreeNodeScript {
	
	public static void main ( String [] args) {
		
		IntegerTreeNodeScript script = new IntegerTreeNodeScript();
		script.launch();
		
	}
	
	public void launch (){
		
		IntegerTreeNode tree = new IntegerTreeNode(6);
		tree.add(5);
		tree.add(9);
		tree.add(3);
		tree.add(8);
		tree.add(11);
		tree.add(12);
		
		
		if (tree.contains(20)==true){
			System.out.println("The value 20 is in the tree");
		}
		else {
			System.out.println("The value 20 is not in the tree");
		}
		
		System.out.println("The highest value in the tree is " +tree.getMax());
		System.out.println("--------------------------------------------------");
		System.out.println("The lowest value in the tree is " +tree.getMin());
		System.out.println("--------------------------------------------------");
		
		System.out.println("The tree entered is");
		System.out.println(tree.toString());
		
		System.out.println("--------------------------------------------------");
		System.out.println(tree.toString2());
		
		System.out.println("--------------------------------------------------");
		System.out.println("The depth of the tree is " +tree.depth(0));
		
	}
	
}