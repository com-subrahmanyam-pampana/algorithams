package basics1.arrays.simple2;

import java.util.Arrays;

public class MinSubArraySumOfSizeK {
	
	 // Returns maximum sum in a subarray of size k.
    public static int maxSum(int arr[], int n, int k)
    {
        // k must be greater
        if (n < k)
        {
           System.out.println("Invalid");
           return -1;
        }
      
        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
      
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
    
    // Returns maximum sum in a subarray of size k.
    public static int maxSum2(int arr[], int n, int k)
    {
    	int sum=0;
    	int tempCount=k; 
    	
    	Arrays.sort(arr);
    	for(int i=(n-1);i>0;i--) {
    		sum=sum+arr[i];
    		
    		if(tempCount>1) {
    			tempCount=tempCount-1;
    		}else {
    			break;
    		}
    	}
    	
    	return sum;
    }
    
    

}
