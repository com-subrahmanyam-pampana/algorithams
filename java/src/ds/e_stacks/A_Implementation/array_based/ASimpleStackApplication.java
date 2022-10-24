package ds.e_stacks.A_Implementation.array_based;

/*Reverse a String*/
public class ASimpleStackApplication {
	  public static void main(String[] args) {
		  Stack stack=new Stack(5);	
		  stack.arr[0]='S';
		  stack.arr[1]='U';
		  stack.arr[2]='B';
		  stack.arr[3]='B';
		  stack.arr[4]='U';
		  System.out.println(stack.arr);
	  }
}
