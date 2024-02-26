package BasicArray;

public class Main {
   public static void main(String[] args) {
	int[] marks = new int[5];  // Space Allocation
	marks[0] = 50; /* Assign Value */
	marks[1] = 100;
	marks[2] = 98;
	marks[3] = 95;
	marks[4] = 73;
	
	for(int i = 0 ; i < marks.length ;i++) {  // Itrate
		System.out.println(marks[i]);// print
	}
	
}
}
