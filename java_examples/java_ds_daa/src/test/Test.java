package test;

import java.util.Arrays;



public class Test {
	
	
	
	
	public static class MyTreeClass {
		public int value;
		public MyTreeClass left;
		public  MyTreeClass right;
		
		MyTreeClass(){
			this.left=null;
			this.right=null;
		}
		
	}
	
	public static   MyTreeClass  getATree() {
		MyTreeClass tree=new MyTreeClass();
		tree.value=4;
		tree.left=new MyTreeClass();
		tree.left.value=8;
		tree.right=new MyTreeClass();
		tree.right.value=10;
		return tree;
	}
	
	public static void  printBranch() {
		int[] a=new int[2];
		 MyTreeClass tree=getATree();
		 printBrachByBranch(tree,0);
		 
		
		
		
	}
	public static void printBrachByBranch(MyTreeClass node,int runningSum){
		if(node==null) {
			return;
		}
		int newRunningSum=runningSum+node.value;
		if(node.left==null && node.right==null) {
			System.out.println(newRunningSum);
		}
		printBrachByBranch(node.left,newRunningSum);
		printBrachByBranch(node.right,newRunningSum);
	}
	

	public static void main(String[] args) {
		int[] a=new int[2];
		test(a);
		printBranch();
		

	}
	
	static void test(int[] b) {
		b[1]=1;
		b[0]=2;
	}

}
