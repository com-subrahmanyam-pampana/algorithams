package a.arrays.s1;
/*
 A1=[1,2,3,4]
A2=[3,4]

 * */
import java.util.List;

public class Q_CheckIfArrayIsASubSequency {

	boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int l1 = array.size();
		int l2 = sequence.size();
		int i = 0, j = 0;
		if (l2 > l1) {
			return false;
		}
		while (i < l1 && j < l2) {
			if (array.get(i) == sequence.get(j)) {
				i++;
				j++;
				// If array a2 is completely traversed
				if (j == l2) {
					return true;
				}
			} else {
				i++;
			}
		}
		return false;
	}
}
