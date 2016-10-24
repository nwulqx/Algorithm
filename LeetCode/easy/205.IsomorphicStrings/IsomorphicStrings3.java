/*
Beats : 87%;
*/
public class IsomorphicStrings3{
	public boolean isIsomorphic(String s, String t) {
		int c1[] = new int[256];
		int c2[] = new int[256];
		for(int i=0;i<s.length();i++){
			if(c1[s.charAt(i)]!=c2[t.charAt(i)])
				return false;
			//Need index i to judge!
			c1[s.charAt(i)] = i+1;
			c2[t.charAt(i)] = i+1;
		}
		return true;
	}
}