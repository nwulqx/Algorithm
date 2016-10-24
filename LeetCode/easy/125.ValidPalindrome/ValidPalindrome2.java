/*Using String.toCharArray is better than using String.charAt();
*/
public class ValidPalindrome2{
	public boolean isPalindrome(String s) {
		char c[] = s.toCharArray();
		int head = 0;
		int tail = c.length-1;
		while(head<=tail){
			if(!Character.isLetterOrDigit(c[head])){
				head++;
			}else if(!Character.isLetterOrDigit(c[tail])){
				tail--;
			}else if(Character.toLowerCase(c[head]) != Character.toLowerCase(c[tail])){
				return false;
			}else{
				head++;
				tail--;
			}
		}
		return true;
	}
}