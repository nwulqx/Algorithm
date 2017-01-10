/* We can use Math.max() method to solve this problem!
*/
public class IntegerBreak{
    public int integerBreak(int n) {
        int b[] = new int[n+1];
        b[1] = 1;
        for(int i=2;i<b.length;i++){
        	for(int j=1;2*j<=i;j++){
        		b[i] = Math.max(b[i],Math.max(b[j],j)*Math.max(b[i-j],i-j));
        	}
        }
        return b[n];
    }
}