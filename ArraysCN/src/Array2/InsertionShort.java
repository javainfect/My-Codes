package Array2;

public class InsertionShort {

	public static void printArray (int []arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	public static void insertionSort(int [] arr) {
		
		for (int i=1; i<arr.length; i++) {
			
			int j  = i-1;
			
			int temp = arr[i];
			
			while( j>=0 && arr[j] > temp) {

				arr[j+1] = arr[j];
				
				j--;
			
			}
			
			arr[j+1]= temp;
		}
		
	}
	
	
	public static void main(String[] args) {
	
		int arr[] = {5,9,2,6,7,1,8,3,0};
		insertionSort(arr);
		printArray(arr);
	}

}
