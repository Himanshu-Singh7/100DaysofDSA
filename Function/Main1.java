package Function;
import java.util.*;
public class Main1 {

 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 int sumofNumber = sumofNumber(n);
	 System.out.println(sumofNumber);
  }
  private static int sumofNumber(int n) {
	int sum = 0;
	while(n > 0) {
	 int d = n % 10;
	  sum = sum + d;
	  n = n / 10;
	}
	return sum;
  }
}
