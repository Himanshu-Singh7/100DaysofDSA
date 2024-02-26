package BasicArray;

public class Main1 {
	public static void main(String[] args) {
     int[] one = new int [3];
     one[0] = 10;
     one[1] = 30;
     one[2] = 40;
     
     int [] two = one;
     two[1] = 2000;
     
     for(int i = 0  ; i < one.length ; i++) {
    	 System.out.println(one[i]);
     }
     
     for(int j = 0 ; j < two.length ; j++) {
    	 System.out.println(two[j]);
     }
	}
}
