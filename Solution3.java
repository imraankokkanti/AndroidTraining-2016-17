public class Solution3{
	public boolean containE(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='e'||str.charAt(i)=='E')
				count++;
		}
		if (count>=1&&count<=3)
			return true;
		else
			return false;
	}
}
