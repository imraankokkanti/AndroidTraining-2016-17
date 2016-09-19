public class Solution4{
	public String embedWord(String a, String b){
		StringBuilder sb=new StringBuilder(a);
		int offset=(sb.length()/2);
		sb.insert(offset,b);
		return sb.toString();
	}
}
