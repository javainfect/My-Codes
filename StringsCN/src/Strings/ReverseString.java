package Strings;

public class ReverseString {

	public static String reverseString(String str) {
		
		String reverseString = "";
		
//		for(int i = str.length()-1 ; i >= 0; i--) {       //first approach
//			reverseString += str.charAt(i);	
//		}
		
		for(int i=0; i<str.length(); i++) {				//Second approach
			reverseString = str.charAt(i) + reverseString;
		}
		return reverseString;
	}
	
	public static void main(String[] args) {
		
		String str = "abcdef";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
		
	}

}
