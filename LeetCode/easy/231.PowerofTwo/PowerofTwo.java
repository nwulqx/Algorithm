public class PowerofTwo{
	public static void main(String []args){

	}
    public static boolean isPowerOfTwo(int n) {
        while(n > 1 && n%2 == 0){
        	n /= 2;
        }
        return n==1;
    }
}