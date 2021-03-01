package Sorting;

import java.util.Arrays;

public class InsertionSorting {
	 /*Function to sort array using insertion sort*/
		static void  doInsertionsort(int arr[])
	    {
	        for (int i = 1; i < arr.length; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            System.out.println("key = "+key +" i = "+i + "    j= "+j+"   Array = "+Arrays.toString(arr));
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            System.out.println("         i = "+i +"    j= "+j+"   Array = "+Arrays.toString(arr));
	            arr[j + 1] = key;
	            System.out.println("*********End of Loop*******");
	        }
	        System.out.println("Sorted Array"+Arrays.toString(arr));
	    }
	 
	    public static void main(String args[])
	    {
	        int arr[] = { 12, 11, 13, 5, 6 };
	        doInsertionsort(arr);
	    }
}
