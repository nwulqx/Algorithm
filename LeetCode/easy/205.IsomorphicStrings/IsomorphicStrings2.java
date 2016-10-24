/*A clever method!
beats: 
*/
public class IsomorphicStrings2{
	public boolean isIsomorphic(String s, String t) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		/*There must be used Integer instead of int !!!
			Because Integer is a class while int is a primary data type.
		*/
		for(Integer i=0;i<s.length();i++){
			if(map.put(s.charAt(i),i) != map.put(t.charAt(i),i))
				return false;
		}
		return true;
	}
}