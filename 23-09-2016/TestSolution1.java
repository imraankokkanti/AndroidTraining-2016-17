import java.util.Arrays;
class Solution1{
	public int[] reverseN(int[] a){
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[a.length-(i+1)]=a[i];
		}
		return b;
	}
}

public class TestSolution1{
	public static void main(String args[]){
		Solution1 sol=new Solution1();
		int a[] ={1,2,3,4,5,6};
		System.out.println(Arrays.toString(sol.reverseN(a)));
	}
}
