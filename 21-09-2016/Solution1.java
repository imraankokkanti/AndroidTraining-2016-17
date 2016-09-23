import java.util.*;
public class Solution1{
	public static void main(String[] args){
		String array1[]={"A","B","C","D"};
		String array2[]={"E","F"};
		
		//LIST Interface
		List<String> list = new ArrayList<String>(Arrays.asList(array1));
		list.addAll(Arrays.asList(array2));
		Object [] array3=list.toArray();
		System.out.println(Arrays.toString(array3));
	}
}
