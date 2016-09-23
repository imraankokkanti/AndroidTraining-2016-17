import java.util.*;
public class Solution2{
	public static void main(String[] args){
		String array1[]={"A","B","C","D"};
		
		//LIST Interface
		List<String> list = new ArrayList<String>(Arrays.asList(array1));
		list.remove(0);
		list.remove("D");
		Object [] array3=list.toArray();
		System.out.println(Arrays.toString(array3));
	}
}

