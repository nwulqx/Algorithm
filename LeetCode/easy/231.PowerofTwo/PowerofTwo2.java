public class PowerofTwo2{
	public static void main(String []args){

	}
	public static boolean isPowerOfTwo(int n) {
		long tmp = Integer.MAX_VALUE+1;
		return n>0&&tmp/n == 0;
	}
}