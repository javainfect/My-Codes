package Arrays;

import java.util.Scanner;

public class InputOfArray {
	
	public static void printArray (int [] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");			
		}		
	}
	
	
	public static int [] takeInput(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of the array :");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++){
			System.out.print("Enter element at "+i+"th index :");
			arr[i]=sc.nextInt();			
		}
		return arr;		
	}

	public static void main(String[] args) {

		int [] arr = takeInput();
		printArray(arr);
		
	}
}
