class Solution2{
	public int sum3(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
			
		return sum;
	}
}

public class TestSolution2{
	public static void main(String args[]){
		int [] a={9,9,9,9,9};
		Solution2 sol= new Solution2();
		System.out.println(sol.sum3(a));
	}
}
		
