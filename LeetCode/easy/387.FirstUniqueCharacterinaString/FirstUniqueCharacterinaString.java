import java.util.*;
/*Using HashMap to solve this problem!
beats : 9.8%
*/
public class FirstUniqueCharacterinaString{
	public static void main(String []args){
		System.out.println(firstUniqChar("loveleetcode"));
	}
    public static int firstUniqChar(String s) {
    	if(s.length()==0) return -1;
    	if(s.length()==1) return 0;
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	int value = 0;
    	for(int i=0;i<s.length();i++){
    		if(map.containsKey(s.charAt(i))){
    			value = map.get(s.charAt(i));
    			map.put(s.charAt(i),++value);
    		}else{
    			map.put(s.charAt(i),1);
    		}
    	}
    	for(int i=0;i<s.length();i++){
    		if(map.get(s.charAt(i))==1)
    			return i;
    	}
    	return -1;
    }
}