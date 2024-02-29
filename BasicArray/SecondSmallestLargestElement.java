package BasicArray;

import java.util.Arrays;

public class SecondSmallestLargestElement {
	public static void main(String[] args) {
     // Brute Force
	 int[] arr = {1,2,4,7,7,5};
	 int n = arr.length;
	 Arrays.sort(arr);
	 getElement(arr,n);
	}
	
	public static void getElement(int arr[] , int n) {
		if(n == 0 || n == 1) {
			
			System.out.print(-1);
			
		}
		
		int secondSmallest = arr[1];
		int secondGreatest = arr[n -2];
		System.out.println("Second Smallest" + secondSmallest);
		System.out.println("Second Greatest" + secondGreatest);
		
	}
}
