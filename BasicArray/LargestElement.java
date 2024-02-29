package BasicArray;

/*Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. */
import java.util.*;
public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 8,10,5,7,9};
		int n = arr.length;

		int max = arr[0];
        for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		
		}
		System.out.println(max + " is the largest element in the array ");
	}
}
