/*Last executed input*/
import java.util.*;
public class ImplementstrStr{
	public static void main(String []args){
		System.out.println(strStr("assssssssadasasdassasas","sa"));
	}
    public static int strStr(String haystack, String needle) {
    	if(needle.length()==0) return 0;
    	boolean [][]b = new boolean[needle.length()+1][haystack.length()+1];
    	b[0][0] = true;
    	for(int i = 1;i<b.length;i++)
    		b[i][0] = false;
    	for(int i = 1;i<b[0].length;i++)
    		b[0][i] = false;
    	for(int i=1;i<b[0].length;i++)
    		if(haystack.charAt(i-1) == needle.charAt(0))
    			b[1][i] = true;
    		else
    			b[1][i] = false;
    	for(int i=2;i<b.length;i++){
    		for(int j=1;j<b[0].length;j++){
    			b[i][j] = (haystack.charAt(j-1) == needle.charAt(i-1)) && b[i-1][j-1];
    		}
    	}
    	for(int i=0;i<b[0].length;i++)
    		if(b[needle.length()][i])
    			return i-needle.length();
    	return -1;
    }
}