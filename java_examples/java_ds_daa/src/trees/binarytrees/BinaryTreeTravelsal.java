package trees.binarytrees;

public class BinaryTreeTravelsal {

	// Function to print tree nodes in InOrder fashion
    public  static void inOrder(MyBinaryTree root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }
}
