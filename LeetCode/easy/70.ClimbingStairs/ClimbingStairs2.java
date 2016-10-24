/*DP problem!
Using array.
When n is 44,the JVM cost 0ms to run it!
*/
public class ClimbingStairs2{
	public static void main(String []args){
		long begin = System.currentTimeMillis();
		int result = climbStairs(44);
		long end = System.currentTimeMillis();
		System.out.println("Time:"+(end-begin)+" result:"+result);
	}
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
    	int a[] = new int[n];
    	a[0] = 1;
    	a[1] = 2;
    	for(int i=2;i<n;i++){
    		a[i] = a[i-1] + a[i-2];
    	}
    	return a[n-1];
    }
}