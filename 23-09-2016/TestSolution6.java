import java.util.Arrays;
class Solution6{
	public boolean isEverywhere(int[] a,int e){
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=e&&a[i+1]!=e)
				return false;
		}
		return true;
	}
}

public class TestSolution6{
	public static void main(String [] args){
		int n[]={1, 2, 1, 3};
		Solution6 sol=new Solution6();
		if(sol.isEverywhere(n,1))
			System.out.println("true");
		else
			System.out.println("false");
	}
}

