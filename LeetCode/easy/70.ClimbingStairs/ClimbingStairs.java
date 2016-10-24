/*When n is 44,the JVM cost 2700ms to run it!
LeetCode: Time Limit Exceeded
*/
public class ClimbingStairs{
	public static void main(String []args){
		long begin = System.currentTimeMillis();
		int result = climbStairs(44);
		long end = System.currentTimeMillis();
		System.out.println("Time:"+(end-begin)+" result:"+result);
	}
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}