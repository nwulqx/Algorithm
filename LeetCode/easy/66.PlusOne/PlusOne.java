/*While loop
beats: 40%
*/
import java.util.*;
public class PlusOne{
	public static void main(String []args){
		System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
	}
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0) return digits;
        int i = digits.length-1;
        while(++digits[i]>9){
        	digits[i] = 0;
        	i--;
        	if(i<0){
        		int result[] = new int[digits.length+1];
        		result[0] = 1;
        		return result;
        	}
        }
        return digits;
    }
}