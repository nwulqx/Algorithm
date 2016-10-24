/*取反加1，以补码的形式运算减法*/
public class SubofTwoIntegers{
	public static void main(String []args){
		System.out.println(getSub(9,9));
	}
	public static int getSub(int a, int b) {
		b = ~b+1;
		return getSum(a,b);
	}
	public static int getSum(int a, int b){
		if(b==0) return a;
		int sum = a^b;
		int carry = (a&b)<<1;
		return getSum(sum,carry);
	}
}