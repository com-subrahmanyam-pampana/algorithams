package basics1.strings.palindrome;

public class LongestPalindromInAString {
	/********************///////Brute Force///////////////*******************/
	
	/* Check each substring whether the substring is a palindrome or not. To do this first, run three nested loops,
	 *  the outer two loops pick all substrings one by one by fixing the corner characters, the inner loop checks 
	 *  whether the picked substring is palindrome or not. */
	
	
	// Function to print a subString str[low..high]
	static void printSubStr(String str, int low, int high)
	{
	    for (int i = low; i <= high; ++i)
	        System.out.print(str.charAt(i));
	}
	 
	// This function prints the
	// longest palindrome subString
	// It also returns the length
	// of the longest palindrome
	static int longestPalSubstr(String str)
	{
	    // get length of input String
	    int n = str.length();
	 
	    /* All subStrings of length 1 are palindromes*/
	    int maxLength = 1, start = 0;
	 
	    // Nested loop to mark start and end index
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i; j < str.length(); j++) {
	            int flag = 1;
	 
	            // Check palindrome
	            for (int k = 0; k < (j - i + 1) / 2; k++)
	                if (str.charAt(i + k) != str.charAt(j - k))
	                    flag = 0;
	 
	            // Palindrome
	            if (flag!=0 && (j - i + 1) > maxLength) {
	                start = i;
	                maxLength = j - i + 1;
	            }
	        }
	    }
	 
	    System.out.print("Longest palindrome subString is: ");
	    printSubStr(str, start, start + maxLength - 1);
	 
	    // return length of LPS
	    return maxLength;
	}
	
	
	
	
	
	
	
	
	//manachersAlgorithm
	int manachersAlgorithm(String s, int N) {
	    String str = getModifiedString(s, N);
	    int len = (2 * N) + 1;
	    int[] P = new int[len];
	    int c = 0; //stores the center of the longest palindromic substring until now
	    int r = 0; //stores the right boundary of the longest palindromic substring until now
	    int maxLen = 0;
	    for(int i = 0; i < len; i++) {
	        //get mirror index of i
	        int mirror = (2 * c) - i;
	        
	        //see if the mirror of i is expanding beyond the left boundary of current longest palindrome at center c
	        //if it is, then take r - i as P[i]
	        //else take P[mirror] as P[i]
	        if(i < r) {
	            P[i] = Math.min(r - i, P[mirror]);
	        }
	        
	        //expand at i
	        int a = i + (1 + P[i]);
	        int b = i - (1 + P[i]);
	        while(a < len && b >= 0 && str.charAt(a) == str.charAt(b)) {
	            P[i]++;
	            a++;
	            b--;
	        }
	        
	        //check if the expanded palindrome at i is expanding beyond the right boundary of current longest palindrome at center c
	        //if it is, the new center is i
	        if(i + P[i] > r) {
	            c = i;
	            r = i + P[i];
	            
	            if(P[i] > maxLen) { //update maxlen
	                maxLen = P[i];
	            }
	        }
	    }
	    return maxLen;
	}

	String getModifiedString(String s, int N){
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < N; i++){
	        sb.append("#");
	        sb.append(s.charAt(i));
	    }
	    sb.append("#");
	    return sb.toString();
	}
	
	
	// Driver Code
		public static void main(String[] args)
		{
		    String str = "bananas";
		    System.out.print("\nLength is: "
		         + longestPalSubstr(str));
		}
	}
	
	
	


