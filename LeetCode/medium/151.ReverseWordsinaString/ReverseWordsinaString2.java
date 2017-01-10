// beats : 39%;
public class ReverseWordsinaString2{
    public static void main(String []args){
        System.out.println(reverseWords("  the  sky         is    blue     "));
    }
    public static String reverseWords(String s) {
    	// String strs[] = s.trim().split("[ \\t\\n\\x0B\\f\\r]+");
        String strs[] = s.trim().split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i=strs.length-1;i>0;i--){
            sb.append(strs[i]+" ");
        }
        return sb.append(strs[0]).toString();
    }
}