package basics1.strings.combinations;

public class AllCombinations {
	
	
	
	static void combo(String prefix, String s)
	  {
	    int N = s.length();

	    System.out.println(prefix);

	    for (int i = 0 ; i < N ; i++)
	      combo(prefix + s.charAt(i), s.substring(i+1));
	  }
	

	public static void main(String[] args) {
		
		combo("", "AB");
	}

}
