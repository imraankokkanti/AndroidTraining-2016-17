import java.util.Arrays;
class Solution5{
	public int[] rotateLeft(int a[]){
		int temp=a[0],i;
		for(i=1;i<a.length;i++)
			a[i-1]=a[i];
		a[i-1]=temp;
		return a;
	}
}

public class TestSolution5{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6};
		Solution5 sol = new Solution5();
		System.out.println(Arrays.toString(sol.rotateLeft(a)));
	}
}
