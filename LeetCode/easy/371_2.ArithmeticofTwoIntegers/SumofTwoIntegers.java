public class SumofTwoIntegers{
	public static void main(String []args){
		System.out.println((2&2)<<1);
		// System.out.println(getSum(3,4));
	}
	public static int getSum(int a,int b){
		if(b == 0) return a;
		int sum = a^b;
		/*error1*/
		int carry = (a&b)<<1;
		return getSum(sum,carry);
	} 
}