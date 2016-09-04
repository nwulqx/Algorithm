public class LongestCommonPrefix{
	public static void main(String []args){
		// System.out.println(longestCommonPrefix(new String[]{"abc","ab","a"}));
		System.out.println(longestCommonPrefix(new String[]{"","12","123"}));

	}
	public static String longestCommonPrefix(String[] strs){
		if(strs.length==0 || strs[0].length()==0) return "";
		int hi = strs[0].length();
		int i = 1;
		while(i<strs.length&&hi>0){
			if(strs[i].length()<hi) hi --;
			
			else if(strs[i].substring(0,hi).equals(strs[0].substring(0,hi))) 
				i ++;
			
			else
				hi--;
		}
		if(hi>0) return strs[0].substring(0,hi);
		else return "";
	}
}