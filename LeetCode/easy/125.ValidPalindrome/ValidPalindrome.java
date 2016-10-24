/*Use regex will creat a new String and it's slow and use O(N) space!
*/
public class ValidPalindrome{
	public static void main(String []args){
		System.out.println("A man, a plan, a canal: Panama".replaceAll("[^a-zA-Z]",""));
	}
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int i = 0,j=s.length()-1;
        while(i<=j){
        	if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
        		return false;
        	i++;
        	j--;
        }
        return true;
    }
}