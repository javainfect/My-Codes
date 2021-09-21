package Arrays;

public class PrintAllPairs {
	
	public static void printAllPairs(int [] arr){
		
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			
			for(int j=i+1; j<n; j++){
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,4,7,5,6};
		printAllPairs(arr);
	}
	
}
