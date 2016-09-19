public class Solution1{
	public int sumDigits(String a){
		int sum=0;
		for(int i=0;i<a.length();i++){
			if(Character.isDigit(a.charAt(i))){
				sum+=Integer.parseInt(a.substring(i,i+1));
			}
		}
		return sum;
	}
}
