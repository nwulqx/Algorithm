public class LongestSubstringWithoutRepeatingCharacters{
	public static void main(String []args){
		System.out.println(lengthOfLongestSubstring(""));
		// System.out.println("abcd".substring(0,4));
	}
    public static int lengthOfLongestSubstring(String s) {
    	if(s.length()==0) return 0;
    	int start = 0 ,length = 0;
    	int i = 0;
		while(i<s.length()){
			int j = i+1;
			while(j<s.length()){
				if(s.substring(i,j).contains(String.valueOf(s.charAt(j)))) 
					break;
				else
					j++;
			}
			System.out.println("i:"+i+" j:"+j);
			if(j-i>length){
				start = i;
				length = j-i;
			}
			i++;
		}
		// System.out.println(s.substring(start,start+length));
		// return s.substring(start,start+1+length);
		return length;

    }
}