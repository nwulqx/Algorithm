// Time complicity is O(n), space complicity is O(1).
// beats : 49%.
public class ReverseWordsinaString{
	public static void main(String []args){
		System.out.println(reverseWords("  the  sky         is    blue     "));
	}
    public static String reverseWords(String s) {
    	s = s.trim();
    	int end = s.length();
    	int begin = s.length()-1;
    	StringBuffer sb = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
        	if(s.charAt(i) == ' '){
        		if(s.charAt(i+1) == ' '){
        			end = i;
        			continue;
        		}
        		begin = i+1;
        		sb.append(s.substring(begin,end)+" ");
        		end = i;
        	}
        	if(i == 0){
        		begin = i;
        		sb.append(s.substring(begin,end));
        		end = i;
        	}
        }
        return sb.toString();
    }
}