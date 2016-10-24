public class MulofTwoIntegers{
	public static void main(String []args){
		System.out.println(getMul(101,-9));
	}
	public static int getMul(int a,int b){
		boolean sign = (b<0);
		if(b<0)
			b = -b;
		int i = -1;
		int mul = 0;
		while(b!=0){
			int temp = b&1;
			i++;
			if(temp!=0){
				mul += (a<<i);
			}
			b >>= 1;
		}
		if(sign)
			mul = -mul;
		return mul;
	}
}