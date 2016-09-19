public class Solution3{
	public int countTriple(String s){
		int tcount=0,count=1;
		
		for(int i=0;i<s.length()-1;i++){
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
				count++;
			}
			else{
				if(count>=3)
					tcount+=(count-2);
				count=1;
			}
		}
		return tcount;
	}
}
