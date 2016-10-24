public class FindtheDifference{
	public static void main(String []args){
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));
	}
    public static char findTheDifference(String s, String t) {
    	char []c1 = s.toCharArray();
    	char []c2 = t.toCharArray();
    	int result = 0;
    	for(int i=0;i<c1.length;i++)
    		result ^= c1[i];
    	for(int i=0;i<c2.length;i++)
    		result ^= c2[i];
    	return (char)result;
    }
}