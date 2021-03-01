package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    static void bubbleSort(int arr[]) 
    { 
        int i, j, temp; 
        boolean swapped; 
     /* Run loops two times: one for walking throught the array
         and the other for comparison*/
        for (i = 0; i < (arr.length - 1); i++)  
        {    System.out.println("**Entering the outer loop for i = " +i+"=******");
            swapped = false; 
            System.out.println(" array before comparison : "+Arrays.toString(arr)); 
            for (j = 0; j < (arr.length - i - 1); j++)  
            {   System.out.println("Inner Loop j = " +j+" arr[j] = "+arr[j]+" arr[j+1] = "+arr[j+1]);
                if (arr[j] > arr[j + 1])  
                { System.out.println("arr[j] = "+arr[j]+">"+ "arr[j+1] = "+arr[j+1]);
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
            
            System.out.println(" array after comparison : "+Arrays.toString(arr)); 
    /*IF no two elements were  swapped by inner loop, then break */
            if (swapped == false) 
                break; 
        } 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = { 6, 3, 4, 1 }; 
        bubbleSort(arr); 
        System.out.println("Sorted array: "+Arrays.toString(arr)); 
    }

}
