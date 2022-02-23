package a.arrays.simple1;

public class TravelAllArrayElements {

	public static void main(String[] args) {
		int[] myArray=new int[5];
		myArray= new  int[]{1,2,3,4,5};
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		for(int a :myArray) {
			System.out.println(a);
		}
	}
	
	
}
