/*How many 5 do we have?
Because 2 is more than 5 in the factorization.
Optimizing:Make the n /= 5 before result += n.
That beats 45 %;
*/
public class FactorialTrailingZeroes2{

	public int trailingZeroes(int n){
		int result = 0;
		while(n>=5){
			n /= 5;
			result += n;
		}
		return result;
	}
}