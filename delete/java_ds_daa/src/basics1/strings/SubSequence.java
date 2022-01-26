package basics1.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSequence {
	
	static List<String> subStringsList=new ArrayList<String>();
	// Set to store all the subsequences
    static HashSet<String> subStringsHashMap = new HashSet<>();
	public static void method1(String tempString,String subString){
		//Pick and Don’t Pick Concept
		
		if (tempString.length() == 0) {
			subStringsList.add(subString);
            return;
        }
		/*Include first character.All the sub sequences includes the first characters*/
		/*If abc is the string,all the sub sequences are abc,a,ab,ac*/
		String s1=tempString.substring(1);
		String s2=subString + tempString.charAt(0);
		method1(s1,s2);
		
		/*Don't include first character.The sub sequences formed don't include  first charater of the string*/
		/*If abc is the string,all the sub sequences are bc,b,c*/
		method1(s1, subString);
		
	}
	public static void method2(String str){
		 // Iterate over the entire string
        for (int i = 0; i < str.length(); i++) {
 
            // Iterate from the end of the string
            // to generate substrings
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);
                System.out.println(sub_str);
 
                if (!subStringsHashMap.contains(sub_str))
                	subStringsHashMap.add(sub_str);
 
                // Drop kth character in the substring
                // and if its not in the set then recur
                for (int k = 1; k < sub_str.length() - 1;
                     k++) {
                    StringBuffer sb
                        = new StringBuffer(sub_str);
 
                    // Drop character from the string
                    sb.deleteCharAt(k);
                    if (!subStringsHashMap.contains(sb)) {
                    method2(sb.toString());}
                }
            }
        }
		
	}
	public static void method3(){
		
	}
	
	public static void main(String[] args) {
		String a ="abc";
		//method1("abcd","");
		method2("abc");
		System.out.println(subStringsList);
	}
	

}
