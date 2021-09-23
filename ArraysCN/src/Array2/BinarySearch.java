package Array2;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int ele) {
		int s=0;
		int e = arr.length-1;
		while(s <= e) {
			
			int m = (s+e)/2;
			
			if(arr[m] > ele) {
				// array mid is greater so we shift end (e) towards right
				e=e-1;
			}
			
			else if(arr[m] < ele) {
				// Array mid is less than element so we shift start (s)towards left
				s = s+1;
				}
			
			else if(arr[m]== ele) {
				//here arr[m] and our element are equal so  we are are returning the index of our element
			   return m;
				}	
		   }
		return -1;
	}
	
	public static void main(String[] args) {
		 int arr [] = {1,3,5,7,8,10};
		 int ele = 3 ;
		 int binary =binarySearch(arr , ele);
		 System.out.println(binary);
	}

}
