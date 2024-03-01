package BasicArray;

import java.util.*;

public class ReverseAnArray {
	public static void display(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int d : arr) {
			sb.append(d + " ");
		}
		System.out.println(sb);
	}
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length -1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		display(arr);
		reverse(arr);
		display(arr);
		
	}

}
