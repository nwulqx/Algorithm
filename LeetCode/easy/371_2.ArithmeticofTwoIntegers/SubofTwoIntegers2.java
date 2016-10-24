/*Very Hard!*/
public class SubofTwoIntegers2{
	public static void main(String []args){
		System.out.println(getSub2(4,5));
	}
	public static int getSub(int a,int b){
		if(b==0) return a;
		int sameBits = a&b;
		a ^= sameBits;
		b ^= sameBits;
		a ^= b;
		b <<= 1;
		return getSub(a,b);
	}
	public static int getSub2(int a,int b){
		while(b!=0){
			int sameBits = a&b;
			a ^= sameBits;
			b ^=sameBits;
			a ^= b;
			b <<= 1;
		}
		return a;
	}
}