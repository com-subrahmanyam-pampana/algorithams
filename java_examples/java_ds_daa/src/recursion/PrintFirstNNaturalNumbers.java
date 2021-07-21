package recursion;

public class PrintFirstNNaturalNumbers {
	
	static void  printNNatural(int n){
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNNatural(n-1);
	}

	public static void main(String[] args) {
		printNNatural(10);

	}

}
