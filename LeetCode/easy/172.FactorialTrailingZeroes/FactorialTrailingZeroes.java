/* Runtime Error!!!
*/
public class FactorialTrailingZeroes{
    public int trailingZeroes2(int n) {
        int num = this.factorial(n);
        int result = 0;
        while(num!=0 && num%10==0){
        	result++;
        	num /= 10;
        }
        return result;
    }
    public int factorial(int num){
    	if(num<=0) return 0;
    	if(num==1) return 1;
    	return num*factorial(num-1);
    }
}