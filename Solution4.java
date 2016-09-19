public class Solution4{
	public void countLeapYear(int a,int b){
		int count=0;
		for(int i=a;i<=b;i++){
			if(i%4==0 && (i%400==0 || i%100!=0))
				count++;
		}
		System.out.println(count);
	}
}
