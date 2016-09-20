public class Solution2{
	public boolean evenlySpaced(int a,int b,int c){
		if(Math.abs(a-b)==Math.abs(b-c)||Math.abs(a-c)==Math.abs(c-b)||Math.abs(c-a)==Math.abs(b-a)){
			return true;
		}
		else
			return false;
	}
}

