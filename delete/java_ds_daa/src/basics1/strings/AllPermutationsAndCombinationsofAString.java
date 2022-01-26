package basics1.strings;

public class AllPermutationsAndCombinationsofAString {
	
	public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
       permute(str, 0, n-1);
       
       
    }
 
   
    private static  void permute(String str, int l, int r)
    {
    	 System.out.println("Method called " +str+" l= "+l+" r="+r);
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
            	 System.out.println("i= " +i+" l="+l+" r " +r);
                str = swapTwoLettersWhenPositionGiven(str,l,i);
                System.out.println("s1= " +str);
                permute(str, l+1, r);
                str = swapTwoLettersWhenPositionGiven(str,l,i);
                System.out.println("S2 = "+str);
            }
        }
    }
 
    
    public static String swapTwoLettersWhenPositionGiven(String a, int i, int j)
    {
    	//THis method seaps 2 letters in the stering
    	//swap(ABC,0,1) return BAC.
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    static void permute(String s , String answer)
    {  
        if (s.length() == 0)
        {
            System.out.print(answer + "  ");
            return;
        }
         
        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

}
