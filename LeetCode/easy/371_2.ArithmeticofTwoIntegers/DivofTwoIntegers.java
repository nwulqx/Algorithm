/*My bad solution!*/
public class DivofTwoIntegers{
	public static void main(String []args){
		System.out.println(getDiv(4,3));
		// System.out.println((0<<1)+1);
	}
	public static int getDiv(int a,int b){
		int bitsNum = 0;
		while(a>=b){
			b <<= 1;
			bitsNum ++;
		}
		b >>= 1;
		System.out.println(bitsNum);
		int div = 0;
		while(a>=b&&b!=0){
			System.out.println(bitsNum);
			a -= b;
			div = (div<<1)+1;
			/*此处错误，除法运算的移位是有次数限制的*/
			b >>= 1;
			bitsNum--;
		}
		if(bitsNum!=0)
			div <<= bitsNum;
		return div;
	}
}