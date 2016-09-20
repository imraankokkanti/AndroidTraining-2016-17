public class Solution1{
	public String withoutString(String a,String b){
		StringBuilder sb=new StringBuilder(a);
		for(int i=0;i<sb.length();i++){
			if(sb.substring(i,i+b.length()).equalsIgnoreCase(b))
				sb.replace(i,i+b.length(),"");
		}
		return sb.toString();
	}
}
