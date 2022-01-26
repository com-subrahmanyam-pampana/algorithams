package ds.Stacks;

import java.util.Arrays;

public class CreatingAStack {

	public static class MyStack{
		private static int arr[];
		private static int top;
		private static int capacity;
		
		public MyStack(int stackSize){
			arr=new int[stackSize];
			capacity=stackSize;
			top=-1;
		}
		
		public static void  push(int i) {  
		   arr[++top]=i;
		   System.out.println(Arrays.toString(arr));
		   
		}
		
		public static int  pop() {
			   //System.out.print(++top);	
			   //arr[top--];
			 if (isEmpty()) {
			      System.out.println("STACK EMPTY");
			      System.exit(1);
			    }
			    return arr[top--];
			
			   
		}
		
		// Check if the stack is empty
		  public static  Boolean isEmpty() {
		    return top == -1;
		  }

		  // Check if the stack is full
		  public  static Boolean isFull() {
		    return top == capacity - 1;
		  }

	}
	
	
	
	
	public static void main(String[] args) {
		
		MyStack stack1=new MyStack(5);
		stack1.push(2);
		stack1.push(2);
		stack1.push(2);
		stack1.pop();
		System.out.println("Final "+(Arrays.toString(stack1.arr)));
		
		
	}
	
	
	

}
