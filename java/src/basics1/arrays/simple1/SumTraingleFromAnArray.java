package basics1.arrays.simple1;


/*
 Given an array of integers, print a sum triangle from 
 it such that the first level has all array elements. 
 From then, at each level number of elements is one less than 
 the previous level and elements at the level is be the Sum of
  consecutive two elements in the previous level. 
           [48]
         [20, 28] 
        [8, 12, 16] 
        [3, 5, 7, 9] 
      [1, 2, 3, 4, 5] 
 
Exp:

 [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
 
 * */
import java.util.Arrays;

public class SumTraingleFromAnArray {
	
	public static void main(String[] args) {
		test();
	}
	
	static void test() {
		/*Iteration*/
		int[] myArray=new int[5];
		myArray= new  int[]{1,2,3,4,5};
		printSumTraingle(myArray);
		
	}
	
	static void printSumTraingle(int[] array) {
		
		if(array.length==0) {
			return;
		}
		int[] tempArray =new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			tempArray[i]=array[i]+array[i+1];
		}
		
		
		
		
	}

}
