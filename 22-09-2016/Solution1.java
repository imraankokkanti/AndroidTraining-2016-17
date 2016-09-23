import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
    
		// intializing an array arr1
		char[] arr1 = new char[] {'a','b','c','d','e','f'};

		// printing the array
		System.out.println("Printing 1st array:"+Arrays.toString(arr1));
		
		// copying array arr1 to arr2 with range of index from 1 to 3
		char[] arr2 = Arrays.copyOfRange(arr1, 2, 5);
	   
		// printing the array arr2
		System.out.println("Printing new array:"+Arrays.toString(arr2));
	}
}
