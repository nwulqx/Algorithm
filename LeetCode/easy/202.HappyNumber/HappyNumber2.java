/*Floyd Cycle Detection Algorithm
beats : 87%
*/
public class HappyNumber2{
	public static void main(String []args){
		System.out.println(isHappy(9));
	}
    public static boolean isHappy(int n) {
        int tmp = n;
        int fast = n,low = n;
        do{
            low = getValue(low);
            fast = getValue(fast);
            fast = getValue(fast);
            if(fast == 1){
                return true;
            }
        }while(low!=fast);
        return false;
    }
 	public static int getValue(int n){
 		int sum = 0;
 		while(n>0){
 			sum += ((n%10)*(n%10));
 			n /= 10;
 		}
 		return sum;
 	}
}	