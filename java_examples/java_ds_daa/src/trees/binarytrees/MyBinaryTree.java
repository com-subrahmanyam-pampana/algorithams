package trees.binarytrees;

/*Node and tree is in same class*/
public class MyBinaryTree {
	public int value;
	public MyBinaryTree left;
	public MyBinaryTree right;
	
	public MyBinaryTree(){
		
	}
	public MyBinaryTree(MyBinaryTree left,MyBinaryTree right,int value){
		this.left=left;
		this.right=right;
		this.value=value;
	}
	public MyBinaryTree(int value){
		this.value=value;
	}
}
