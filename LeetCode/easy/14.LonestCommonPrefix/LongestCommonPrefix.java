import java.util.*;
/*find the largest time in string*/
public class LongestCommonPrefix{
	public static void main(String []args){
		String str[] = {"abcdefg","abcefc"};
		System.out.println(longestCommonPrefix(str));
	}
	public static String longestCommonPrefix(String[] strs) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String tmp = null;
		for(int k=0;k<strs.length;k++){
	        for(int i=0;i<strs[k].length();i++){
	        	for(int j=i+1;j<=strs[k].length();j++){
	        		tmp = strs[k].substring(i,j);
	        		if(map.containsKey(tmp)) map.put(tmp,map.get(tmp)+1);
	        		else map.put(tmp,1);
	        	}
	        }
		}
		Set<Map.Entry<String,Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = set2.iterator();
		Map.Entry<String,Integer> map2 = null;
		Integer max = 0;
		String prefix = null;
		while(it.hasNext()){
			map2 = it.next();
			if(map2.getValue()>max){
				max = map2.getValue();
				prefix = map2.getKey();
			}
		}
		return prefix;
    }
}