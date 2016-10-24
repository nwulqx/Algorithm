import java.util.*;
/*Very very low algorithm...
beats : 1.4 %;
*/
public class HappyNumber{
	public static void main(String []args){
		System.out.println(isHappy(7));
	}
    public static boolean isHappy(int n) {
    	Set<Integer> set = new HashSet<Integer>();
    	while(true){
    		if(n == 1){
    			return true;
    		}
    		if(set.contains(n)){
    			return false;
    		}
    		set.add(n);
    		n = getValue(n);
    		System.out.println(n);
    	}
    
    }
    public static int getValue(int n){
    	int sum = 0;
		while(n > 0){
			sum += ((n%10)*(n%10));
			n /= 10;
    	}
    	return sum;
    }
}