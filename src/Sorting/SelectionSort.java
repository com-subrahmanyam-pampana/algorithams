package Sorting;

import java.util.Arrays;

class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < arr.length-1; i++) 
        {   System.out.println("Before comparision  array ="+ Arrays.toString(arr)); 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < arr.length; j++) {
            	  if (arr[j] < arr[min_idx]) 
                      min_idx = j; 
            	
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {3,1,7,2}; 
        ob.sort(arr); 
        System.out.println("Sorted array ="+ Arrays.toString(arr)); 
       
    } 
} 
