public class ArithmeticofTwoIntegers{
	public static void main(String []args){
		System.out.println(getDiv(14,44));
	}
	/*-*/
	public static int getSub(int a, int b){
		if(b==0) return a;
		int sameBites = a&b;
		a ^= sameBites;
		b ^= sameBites;
		a ^= b;
		b <<= 1;
		return getSub(a,b);
	}
	/*+*/
	public static int getSum(int a, int b){
		if(b == 0) return a;
		int sum = a^b;
		int carry = (a&b)<<1;
		return getSum(sum,carry);
	}
	/* * */
	public static int getMul(int a, int b){
		boolean sign = (b<0);
		if(sign)
			b = -b;
		int mul = 0;
		int i=-1;
		while(b!=0){
			i++;
			int bit = b&1;
			if(bit==1)
				mul += (a<<i);
			b >>= 1;
		}
		if(sign)
			mul = -mul;
		return mul;
	}
	/* / */
	public static int getDiv(int a, int b){
		int bits = 0;
		while(a>b){
			bits++;
			b <<= 1;
		}
		int div = 0;
		for (int i=bits; i>=0; i--) {
			if(b>a){
				b >>= 1;
				continue;
			}
			div += (1<<i);
			a -= b;
			b >>= 1;
		}	
		return div;
	}
}