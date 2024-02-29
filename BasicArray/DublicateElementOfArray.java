package BasicArray;

import java.util.*;
public class DublicateElementOfArray {
	public static void main(String[] args) {
     
		Scanner scn = new Scanner(System.in);
		
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		int n = arr.length;
		
		// Logic 
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++ ) {
				if(arr[i] == arr[j] && i != j) {
					System.out.println("Dublicate element " + arr[j]);
				}
			}
		}
		
		
	}
}
