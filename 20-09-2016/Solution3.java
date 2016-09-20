public class Solution3{
	public String repeatSeperator(String base,String spt,int rpt){
		StringBuilder sb=new StringBuilder(base);
		while(rpt!=1){
			sb.append(spt);
			sb.append(base);
			rpt--;
		}
		return sb.toString();
	}
}
