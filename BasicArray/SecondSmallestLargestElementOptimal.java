package BasicArray;

public class SecondSmallestLargestElementOptimal {
 
	public static int secondSmallest(int arr[], int n) {
		if(n < 2) {
			return -1;
		}
		
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			}else if (arr[i] < secondSmall && arr[i] != small){
				secondSmall = arr[i];
			}
		}
		
		return secondSmall;
		
	}
	
    public static int secondGreatest(int arr[], int n) {
    	if(n < 2) {
			return -1;
		}
    	int large = Integer.MIN_VALUE;
    	int secondlarge = Integer.MIN_VALUE;
    	
    	for(int i = 0 ; i < n ; i++) {
    		if(arr[i] > large) {
    			secondlarge = large;
    			large = arr[i];
    		}else if(arr[i] > secondlarge && arr[i] != large  ) {
    			secondlarge = arr[i];
    		}
    	}
    	
    	return secondlarge;
		
	}
	
	public static void main(String[] args) {
	// Optimal Approach
	 
	 int[] arr = {1, 2, 4, 7, 7, 5};
	 int n = arr.length;
	 int secondSmallest = secondSmallest(arr,n);
	 
	 int secondGreatest = secondGreatest(arr,n);
	 System.out.println("Second smallest : " + secondSmallest );
	 System.out.println("Second Greatest : " + secondGreatest);
  }
}
