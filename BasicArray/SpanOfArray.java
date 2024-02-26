package BasicArray;
// Diffrence between  Max  array and min array
// input 10,2, 3,4,5,6 : Output 8
import java.util.*;
public class SpanOfArray {
	public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[] = new int[n];
       for(int i = 0 ; i < arr.length ; i++) {
    	   arr[i] = scn.nextInt();
       }
       
      int max = arr[0];
      int min = arr[0];
      for(int i = 1; i < arr.length ; i ++) {
    	  if(arr[i] > max) {
    		  max = arr[i];
    	  }
    	  
    	  if(arr[i] < min) {
    		  min = arr[i];
    	  }
      }
      
      int span = max - min;
      System.out.println(span);
       
	}
}
