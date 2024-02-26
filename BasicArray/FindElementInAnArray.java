package BasicArray;
import java.util.*;
// Input 6 : 6,15,30,40,4,11,9 -<< Output 2

public class FindElementInAnArray {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt(); // 6
	
	int[] arr = new int[n];
	
	for(int i = 0 ; i < arr.length ; i++) {
		arr[i] = scn.nextInt(); // 6,15,30,40,4,11,9
		
	}
	int d = scn.nextInt(); // 40
	for(int i = 0 ; i < arr.length ; i++) {
		if(d == arr[i]) {
			System.out.println(i); // Oupout : 2
		}
	}
}
}
