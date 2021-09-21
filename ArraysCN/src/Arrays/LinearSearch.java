
package Arrays;

public class LinearSearch {
	public static int linearSearch(int [] arr, int element){		
		for(int i=0 ;i<arr.length; i++){
			if(arr[i] == element){
				return i;
			}
		}		
		return -1 ;
	}	
	public static void main(String [] args){
		
		int [] arr = {1,3,6,7,8,2};		
		int element = 8;		
		int linearSearch = linearSearch(arr, element);		
		System.out.println(linearSearch);		
	}
}
	
