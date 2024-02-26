package BasicArray;
public class Main2 {
	
	private static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void main(String[] args) {
    int [] arr;
    arr = new int [5];
    
    arr[0] = 29;
    arr[1] = 24;
    arr[2] = 65;
    arr[3] = 62;
    arr[4] = 61;
    
    swap(arr,0,4);
    
    for(int i =0 ; i < arr.length ; i++) {
    	System.out.println(arr[i]);
    }
    
    
	}

	
}
