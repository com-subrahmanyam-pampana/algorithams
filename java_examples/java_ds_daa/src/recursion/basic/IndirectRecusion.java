package recursion.basic;

//Print the first 20 integers
public class IndirectRecusion {
	static int n=0;
	
	static void foo1() 
	{ 
	  if (n <= 20) 
	  { 
	    System.out.println(n);  
	    n++;          
	    foo2();       
	  } 
	  else
	    return; 
	} 

	static void foo2() 
	{ 
	  if (n <= 20) 
	  { 
		  System.out.println(n);  
	    n++;           
	    foo1();      
	  } 
	  else
	    return; 
	} 

	public static void main(String[] args) {
		foo1() ;
	}

}
