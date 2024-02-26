package Function;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    try {
        int n = scn.nextInt();
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    } catch (InputMismatchException e) {
        System.out.println("Input must be an integer.");
    }
 }
}
