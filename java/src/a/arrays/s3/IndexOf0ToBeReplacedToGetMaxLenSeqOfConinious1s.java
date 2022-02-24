package a.arrays.s3;


/*
 Find the index of 0 to be replaced to get the maximum
  length sequence of continuous ones
  { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. We need to replace index 7 
  {1,1,1,1,0} replace 4th index
 * */
public class IndexOf0ToBeReplacedToGetMaxLenSeqOfConinious1s {
	
	/*BF method n2 approch*/
	static int method1(int[] a){
		int requiredPosition=-1;
		for(int i=0;i<a.length;i++) {
			int onesCount=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==1) {
					onesCount++;
				}
			}
		}
		return requiredPosition;
	}
	
	public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
 
        int index = method1(A);
 
        if (index != -1) {
            System.out.print("Index to be replaced is " + index);
        }
        else {
            System.out.print("Invalid input");
        }
    }

}
