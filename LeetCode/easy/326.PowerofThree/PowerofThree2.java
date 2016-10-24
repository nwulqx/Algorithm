public class PowerofThree2{
	public static void main(String []args){
		System.out.println(isPowerOfThree(387420489));
	}
    public static boolean isPowerOfThree(int n) {
    	 return (n > 0 && 1162261467 % n == 0);
    }
}