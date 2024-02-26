package Interview;

import java.util.*;
public class Main1 {
  public static void main(String[] args) {
	 
	  int[] input1 = {1,3,5};
	  int[] input2 = {2,4,5,6};
	  int[] mergerArray = mergerArray(input1,input2);
	  System.out.println(mergerArray);
  }
  
  public static int[] mergerArray(int[] input1 , int[]input2) {
	  
	  int[] resunlt = new int[input1.length + input2.length];
	  int i = 0;
	  int j = 0;
	  int k = 0;
	  while(i < input1.length &&j < input2.length) {
		  resunlt[k++] = (input1[i] < input2[j]) ? input1[i++] : input2[j++];  
	  }
	  
	  while(i < input1.length) {
		  resunlt[k++] = input1[i++];
	  }
	  
	  while(j < input2.length) {
		  resunlt[k++] = input2[j++]; 
	  }
	  
	  return resunlt;
  }
}
