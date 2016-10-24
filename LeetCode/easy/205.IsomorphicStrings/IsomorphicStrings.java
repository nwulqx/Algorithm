/*
	This is an error method!
*/
public class IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {
    	if(s.length()==0 && t.length()==0) return true;
    	char c1[] = s.toCharArray();
    	char c2[] = t.toCharArray();
        boolean b[] = new boolean[s.length()];
        b[0] = true;
        for(int i=1;i<s.length();i++){
        	if(c1[i] == c1[i-1] && c2[i] == c2[i-1])
        		b[i] = true;
        	else if(c1[i] != c1[i-1] && c2[i] != c2[i-1])
        		b[i] = true;
        	else
        		b[i] = false;
        }
        return b[s.length()-1];
    }
}