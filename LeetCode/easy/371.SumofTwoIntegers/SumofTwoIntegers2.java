public class SumofTwoIntegers2{
	public static void main(String []args){
		System.out.println(getSum(2,2));
	}
	public static int getSum(int a, int b) {
		if(b==0) return a;
		int sum = a^b;
		int carry = (a&b)<<1;
		return getSum(sum,carry);
	}
}