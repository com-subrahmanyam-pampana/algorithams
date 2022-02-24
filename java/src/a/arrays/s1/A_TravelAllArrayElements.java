package a.arrays.s1;

/*Travel all the elements in an array*/
/*TC always >=n */
public class A_TravelAllArrayElements {

//////////////////////////////////////
/////////Method1/////////////////////
/////////////////////////////////////

	public static void usingForLoop1(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
//////////////////////////////////////
/////////Method2/////////////////////
/////////////////////////////////////

	public static void usingForLoop2(int[] myArray) {
		for (int a : myArray) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int[] myArray = new int[5];
		myArray = new int[] { 1, 2, 3, 4, 5 };
	}

}
