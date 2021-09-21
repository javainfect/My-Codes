package Arrays;

import java.util.Scanner;

public class LargestOfNumber {
	
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

	public static int largest(int [] arr){
		
		int max =Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++){
			if (arr [i] > max){
				max = arr[i];
				System.out.println("comparing " + i +"th postion");
				System.out.println();
				System.out.println("till now largest :"+ max);
				System.out.println();
			}
		}  
		return max;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = takeInput();
		
		int lar = largest(arr);
		
		System.out.println("Largest among all is :"+lar);
	}

}
