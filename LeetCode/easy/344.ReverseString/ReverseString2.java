/*A smart method!*/
public class ReverseString2{
	public static void main(String []args){
		System.out.println(reverseString("Hello"));
	}
	 public static String reverseString(String s) {
        if(s == null || s.length() == 0)
        return "";
	 	char c[] = s.toCharArray();
	 	int lo = 0;
	 	int hi = c.length-1;
	 	while(lo<hi){
	 		if(c[lo]==c[hi]){
	 			lo++;
	 			hi--;
	 			continue;
	 		}
	 		c[lo] = (char)(c[lo]^c[hi]);
	 		c[hi] = (char)(c[lo]^c[hi]);
	 		c[lo] = (char)(c[lo]^c[hi]);
	 		lo++;
	 		hi--;
	 	}
	 	return new String(c);
	 }
}