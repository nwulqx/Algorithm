public class ReverseBits{
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int count = 0;
        while(n!=0){
        	count++;
        	int bit = n&1;
        	result <<= 1;
        	result += bit;
        	n >>>= 1;
        }
        result <<= (32-count);
        return result;
    }
}