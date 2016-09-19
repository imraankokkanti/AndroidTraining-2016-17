public class Solution2{
	public int maxBlock(String s){
		int max=1,temp=1;
		
		for(int i=0;i<s.length()-1;i++){
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
				temp++;
			}
			else{
				if (temp>max)
					max=temp;
				temp=1;
			}
		}
		return max;
	}
}
