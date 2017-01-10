public class IsSubsequence{
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for(int i=0;i<s.length();i++){
        	for(char c : s.toCharArray()){
        		int j = t.indexOf(c,index);
        		if(j==-1)
        			return false;
        		index ++;
        	}
        }
        return true;
    }
}