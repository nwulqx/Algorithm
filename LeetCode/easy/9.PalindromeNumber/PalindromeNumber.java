import java.util.*;
/*less time complexity!!!*/
public class PalindromeNumber{
	public static void main(String args[]){
		System.out.println(isPalindrome(20));
	}
	public static boolean isPalindrome(int x) {
		if(x<0||(x!=0 && x%10==0)) return false;
		int result = 0;
		while(x>result){
			result*=10;
			result+=(x%10);
			x/=10;
		}
		return (x==result || x==result/10);
    }
}