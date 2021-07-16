package recursion;


//Input: n = 16
//Output: 16, 11, 6, 1, -4, 1, 6, 11, 16
//
//Input: n = 10
//Output: 10, 5, 0, 5, 10
public class PrintAPattern {

	public static void main(String[] args) {
		
		printAPattern(16,16,true);

	}
	
	static void  printAPattern(int maxNum,int currentNum,boolean flag){
		System.out.println(currentNum);
		if(maxNum==currentNum&&!flag) {
			return;
		}
		if(flag) {
			if(currentNum-5>0) {
				printAPattern(maxNum,currentNum-5,true);
			}else {
				printAPattern(maxNum,currentNum-5,false);
			}
		}else {
			printAPattern(maxNum,currentNum+5,false);
		}
	}

}
