public class Numberof1Bits{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int bits = 0;
    	while(n!=0){
    		bits += n&1;
    		/*We need to use bit shifting unsigned operation >>> (while >> depends on sign extension)*/
    		n >>>= 1;
    	}
    	return bits;
    }
}