public class Solution5{
	public String makeTags(String tag,String dat){
		StringBuilder sb=new StringBuilder("<");
		sb.append(tag).append(">").append(dat).append("</").append(tag).append(">");
		return sb.toString();
	}
}
