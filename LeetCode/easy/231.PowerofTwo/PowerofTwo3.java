public class PowerofTwo3{
	public static void main(String []args){
		// System.out.println(isPowerOfTwo(32));
		System.out.println(Math.log10(27) / Math.log10(3));
	}
	public static boolean isPowerOfTwo(int n) {
		return n>0 && (n&(n-1))==0;
	}
}