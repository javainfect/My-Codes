package ArrayLeetcode;

import java.util.Scanner;

public class TwoSum {
	
	public static int twoSum (int [] num , int target) {
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				 if(num[i]+ num[j] == target) {
					return j ;
				 }
				 return i;
			} 
		}
		return target;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[] num = {5,8,9,2,5};
		int target = 11 ;
		
		twoSum(num, target);	
		
	}

}
