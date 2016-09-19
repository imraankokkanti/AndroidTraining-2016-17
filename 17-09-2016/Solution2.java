public class Solution2{
	public String backAround(String str){
		StringBuilder sb=new StringBuilder(str);
		sb.insert(0,sb.charAt(sb.length()-1));
		sb.insert(sb.length()-1,sb.charAt(sb.length()-1));
		return sb.toString();
	}
}
