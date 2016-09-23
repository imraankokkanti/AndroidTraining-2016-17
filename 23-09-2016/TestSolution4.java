import java.util.Arrays;
class Solution4{
	public boolean containsPi(int[] a){
		for(int i=0;i<a.length-2;i++){
			if(a[i]==3&&a[i+1]==1&&a[i+2]==4)
				return true;
		}
		return false;
	}
}

public class TestSolution4{
	public static void main(String [] args){
		int n[]={1,3,1,4,4,5};
		Solution4 sol=new Solution4();
		if(sol.containsPi(n))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
