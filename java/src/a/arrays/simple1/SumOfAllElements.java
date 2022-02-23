package basics1.arrays.simple1;

public class SumOfAllElements {
	
	public static void main(String[] args) {
		
		int[] myArray=new int[5];
		myArray= new  int[]{1,2,3,4,5};
		
		int sum =recursion(myArray,0,myArray.length-1);
		System.out.println(sum);
		
		int sum2 =recursion(myArray,0,myArray.length-1);
		System.out.println(sum2);
	}
	
	
	
	private  static int recursion(int[] myArray,int sum,int index) {
		if(index < 0) {
			return sum;
		}else {
			 return recursion(myArray,sum+myArray[index],index-1);
		}
	}
	
	private  static int recursion2(int[] myArray,int l,int h) {
		if(l == h) {
			return myArray[l];
		}else {
			 return (myArray[l]+recursion(myArray,l+1,h));
		}
	}
	
	
	private  static int iteration(){
		
		int[] myArray=new int[5];
		myArray= new  int[]{1,2,3,4,5};
		int sum=0;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];	
		}
		System.out.println(sum);
		return sum;
	}
}
