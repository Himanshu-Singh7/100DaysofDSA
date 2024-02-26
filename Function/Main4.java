package Function;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int count = 0;
		for (int div = 2; div * div <= n; div++) {
         if(n % div == 0) {
        	 count++;
        	 break;
         }
		}
		
		if(count == 0) {
			System.out.println("is prime ");
		}else {
			System.out.println("is not prime");
		}
	}
}
