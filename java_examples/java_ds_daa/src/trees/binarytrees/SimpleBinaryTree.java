package trees.binarytrees;


class SimpleNode{
	
	int key;
	SimpleNode left,right;
	
	public SimpleNode(int item) {
		key=item;
		left=right=null;
		
	}
	
}
public class SimpleBinaryTree {
	SimpleNode root;
	
	public static void main(String args[]) {
		SimpleBinaryTree tree = new SimpleBinaryTree();
		tree.root=new SimpleNode(1);
		tree.root.left=new SimpleNode(2);
		tree.root.right=new SimpleNode(4);
		tree.root.right.left=new SimpleNode(6);
	}

}

