/*Causing : java.lang.StackOverflowError when n = 2147483647!
Now we need to use loop or DP!
*/
public class IntegerReplacement{
    public int integerReplacement(int n) {
        if(n==1) return 0;
        if(n%2==0){
        	int count = 0;
        	while(n%2==0){
        		count++;
        		n /=2;
        	}
        	return integerReplacement(n)+count;
        }
    	int ceil = integerReplacement(n+1);
    	int floor = integerReplacement(n-1);
    	return Math.min(ceil,floor)+1;
    }
}