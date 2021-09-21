package Arrays;

public class PrimitiveAndNonPrimitive {
	
//	public static void increment(int n){
//		n++;
//	}
	
	public static void incrementArray(int [] input){
		
		for(int i=0; i<input.length; i++){
			System.out.print(input[i]);
			input[i]= input[i]+1;
		}
	}
	
	public static void printArray (int [] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	public static void main(String[] args) {
//		int i = 10;
//		increment(i);
//		System.out.println(i);
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr);
		incrementArray(arr);
		printArray(arr);
	}

}
