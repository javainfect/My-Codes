package Array2;

public class BinarySearch {
	
//	public static void printArray (int arr){
//		int n = arr.length;
//		for(int i = 0; i < n; i++){
//			System.out.print(arr[i]+" ");			
//		}		
//	}
	
	public static int binarySearch(int[] arr, int ele) {
		int s=0;
		int e = arr.length;
		while(s<= e) {
			int m = (s+e)/2;
			if(arr[m] > ele) {
				s++;
			}
			else if(arr[m] < ele) {
					e--;
				}
				else if(arr[m]== ele) {
						return m;
				}	
		   }
		return -1;
	}
	
	public static void main(String[] args) {
		 int arr [] = {1,3,5,7,8,10};
		 int ele = 5;
		 binarySearch(arr , ele);
		 //System.out.println(binarysearch);
		
	}

}
