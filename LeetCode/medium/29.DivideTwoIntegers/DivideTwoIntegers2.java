// beats : 89%;
public class DivideTwoIntegers2{
	public int divide(int dividend, int divisor) {
		if(dividend==Integer.MIN_VALUE && divisor==-1)
			return Integer.MAX_VALUE;
		int sign = 1;
		if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))
			sign = -1;
		long a = Math.abs((long)dividend);
		long b= Math.abs((long)divisor);
		if(a==0 || a<b) 
			return 0;
		long res = this.help(a,b);
		return sign<0?-(int)res:(int)res;
	}
	public long help(long dividend, long divisor){
		int bitCount = 0;
		while(dividend>=(divisor<<bitCount)){
			bitCount ++;
		}
		long res = 0;
		for(int i=bitCount;i>=0;i--){
			if(dividend < (divisor<<i)){
				res <<= 1;
				continue;
			}
			dividend -= (divisor<<i);
			res = (res << 1)+1;
		}
		return res;
	}
}