/*Using Arrat to solve this problem 
beats : 98%
*/
public class FirstUniqueCharacterinaString2{
	public static void main(String []args){
			System.out.println(firstUniqChar("loveleetcode"));
	}
	public static int firstUniqChar(String s) {
    	if(s.length()==0) return -1;
    	if(s.length()==1) return 0;
		int nums[] = new int[258];
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++){
			nums[c[i]] ++;
		}
		for(int i=0;i<c.length;i++){
			if(nums[c[i]]==1){
				return i;
			}
		}
		return -1;
	}
}