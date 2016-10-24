public class WordPattern{
    public boolean wordPattern(String pattern, String str) {
        char c[] = pattern.toCharArray();
        String s[] = str.split(" ");
        if(c.length!=s.length) return false;
        Map<Character,Integer> m1 = new HashMap<Character,Integer>();
        Map<String,Integer> m2 = new HashMap<String,Integer>();
        for(Integer i=0;i<c.length;i++){
        	if(m1.put(c[i],i)!=m2.put(s[i],i))
        		return false;
        }
        return true;
    }
}