package Array2;

public class BubbleSort {

	public static void printArray (int []arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	public static void bubbleSort(int [] arr) {
		
		for(int i=0; i<arr.length; i++) { //for the n-1 rounds that sorts the array
			
			for(int j=0 ; j<arr.length-1-i; j++) {// j=n-1-i so that the last part of n-1 rounds sorted we don't compare
				
			if(arr[j] > arr[j+1]) {// comparison operator ascending(>) and for descending we use (<)
				//agar a[j] bada hoga arr[j+1] se , so we swap them\
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr [j+1] = temp;
				
			}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr  = {5,2,9,7,8,3,0,4};
		bubbleSort(arr);
		printArray(arr);

	}

}
