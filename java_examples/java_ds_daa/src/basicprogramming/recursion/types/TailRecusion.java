package basicprogramming.recursion.types;

public class TailRecusion {
	
	//Factorial of a number
	
	static int tradationalFactorial(int number) {
		if(number==0) {
			return 1;
		}else {
			return number * tradationalFactorial(number-1);
		}
	}
	
	static int  tailFactorial(int number,int factorialValue) {
		if(number==0) {
			return 1;
		}else {
			return tailFactorial(number-1,factorialValue*number);
		}
	}
	
	
	
	//Sum of n natural numbers
	
	static int recsum(int x) {
	    if (x == 1) {
	        return x;
	    } else {
	        return x + recsum(x - 1);
	    }
	}
	
	static int tailrecsum(int x, int running_total) {
	    if (x == 0) {
	        return running_total;
	    } else {
	        return tailrecsum(x - 1, running_total + x);
	    }
	}


	
	
	public static void main(String args[]) {
		
		int x=tailFactorial(5,5);
		int y=tailrecsum(5,0);
		System.out.println(y);
		
	}
	

}
