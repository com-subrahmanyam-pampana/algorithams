package trees.datasets;

import trees.binarytrees.models.BinaryTreeTravelsal;
import trees.binarytrees.models.FormABinaryTree;
import trees.binarytrees.models.ds.MyBinaryTree;

public class BinaryTree {
	
	public MyBinaryTree getASimpleBinaryTree1(){
		MyBinaryTree tree=new MyBinaryTree(12);
		tree.left=new MyBinaryTree(14);
		tree.right=new MyBinaryTree(15);
		return tree;
	}
	
	public static  MyBinaryTree  getASimpleCompleteBinary() {
		MyBinaryTree tree = new MyBinaryTree();
		int arr[] = { 1, 2, 3, 4, 5, 9, 9, 9, 9 };
		tree =FormABinaryTree.getCompleteBinaryTreeFromAnArray(arr);
		BinaryTreeTravelsal.inOrder(tree);
		return tree;
        
	}

	
	public static void main(String[] args) {
		
		getASimpleCompleteBinary();
	}

}
