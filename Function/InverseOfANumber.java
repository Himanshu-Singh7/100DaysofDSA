package Function;

import java.util.*;

public class InverseOfANumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int inv = 0;   // i = inverse
        int op =1;  // op = Orignal Place 
        
		while(n != 0) {
		    
			int od = n % 10;  // OrignalDigit
			
			int id = op;     // id = Inverted Digit
			int ip = od;     // ip = Inverted place
			inv = inv + id * (int)Math.pow(10, ip-1); 
			
		    n = n/ 10;
			op++;
		}
		
		System.out.println("Inverce of Number : "+inv+ " ");
	}
}
