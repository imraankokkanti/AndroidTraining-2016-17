public class Solution3{
	public void sumInt(int a,int b){
		int sum=0;
		for(int i=a;i<=b;i++){
			if((i%13==0 || i%15==0 || i%17==0)&&i%30!=0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
