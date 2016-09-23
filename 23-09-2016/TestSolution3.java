import java.util.Arrays;
class Solution3{
	public int[] makeLast(int[] a){
		int [] n= new int[2*a.length];
		n[n.length-1]=a[a.length-1];
		return n;
	}
}

public class TestSolution3{
	public static void main(String [] args){
		int n[]={1,3,4,5,6};
		Solution3 sol=new Solution3();
		System.out.println(Arrays.toString(sol.makeLast(n)));
	}
}
	
