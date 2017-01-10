/*My solution is  Time Limit Exceeded
*/
public class RotateFunction{
    public int maxRotateFunction(int[] A) {
    	if(A.length == 0) return 0;
        int len = A.length;
        int max = Integer.MIN_VALUE;
        for(int k=0;k<len;k++){
        	int sum = 0;
        	for(int i=0;i<len;i++){
        		sum += i*A[(i+k)%len];
        	}
        	if(sum > max) max = sum;
        }
        return max;
    }
}