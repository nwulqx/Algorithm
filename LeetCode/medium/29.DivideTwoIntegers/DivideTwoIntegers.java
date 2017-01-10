// we will have a overflow when MIN / (-1);
public class DivideTwoIntegers{
	public static void main(String []args){
		System.out.println(divide(12,3));
	}
    public static int divide(int dividend, int divisor) {
    	int bitCount = 0;
        while(dividend >= (divisor<<bitCount))
        	bitCount ++;
       	
       	int result = 0;
        for(int i=bitCount;i>=0;i--){
        	if((divisor<<i)>dividend){
        		result <<= 1;
        		continue;
        	}
        	dividend -= (divisor<<i);
        	result = (result<<1)+1;
        	// (result <<= 1) |= 1;
        }
        return result;
    }
}