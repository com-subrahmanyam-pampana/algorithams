package basics1.anagram;

import java.io.*;
import java.util.*;
public class Check2StringAnagrom {
	static int NO_OF_CHARS = 256;
	
	private static boolean isAnagram(char str1[],char str2[]) {
		
	
		int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;
        
        System.out.println(count1.toString());
        System.out.println(count2.toString());
 
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length && i < str2.length;
             i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        
        System.out.println(Arrays.toString(count1));
        System.out.println(Arrays.toString(count2));
        
        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;
 
        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;
 
        return true;

		
	}
	
	private static boolean isAnagramStrings(char[] s1,char[] s2){
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(s1.length !=s2.length){
			return false;
		}
		
		for(int i=0;i<s1.length;i++){
			if(s1[i] != s2[i]){
				return false;
			}
		}
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
	
	  char s1[]= ("app").toCharArray();
	  char s2[]= ("pasp").toCharArray();
	  
	  System.out.println(isAnagram(s1,s2));
	  
	}

}
