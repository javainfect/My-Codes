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
		for(int i = 0; i<n-1 ; i++) {
			
			int min = i;
			
			for(int j = i; j<n; j++) {
			if(arr[min]<arr[j]) {
				min = i;
			}
			}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min]= temp;
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {8,9,2,7,6,4,0,1};
		selectionSort(arr);
		printArray(arr);
	}

}
