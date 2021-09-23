package Array2;

//in this we are merging two sorted arrays

public class MergeArrays {
	
	public static void printArray (int []arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	public static int[] mergeTwoArrays(int [] arr1, int [] arr2) {
		
		int [] arr  = new int [arr1.length + arr2.length];
		int i = 0;
		int j = 0;	
		int k = 0;//new array starting
		
		while (i<arr1.length && j<arr2.length) {
			
			if (arr1[i]<= arr2[j]){
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while (i<arr1.length) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j<arr2.length) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr1[]= {1,3,5,7,9,11,13,15,16,17};
		
		int arr2[]= {2,4,6,8,10,12,14};
		
		int arr []= mergeTwoArrays(arr1, arr2);
		
		printArray(arr);
	}

}
