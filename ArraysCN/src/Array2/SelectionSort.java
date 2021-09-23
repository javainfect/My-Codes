package Array2;

public class SelectionSort {
	
	public static void printArray (int []arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	public static void selectionSort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) { // for n-1 rounds we have to short our array
			
				int minIndex = i;	
				
			for(int j = i; j<n; j++) { // for comparing j th element with the minIndex (i) element
				
			if(arr[minIndex] > arr[j]) { 
				 // here I mad small mistake of comparison operator ascending(>) and for descending we use (<)
				minIndex = j;

			}
			
			}
			// here we all got out smaller elment and we swap it with the larger ones
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {8,9,2,7,6,4,0,1};
		selectionSort(arr);
		printArray(arr);
	}

}
