/*Using recursion!
Beats:20%;
*/
public class GuessNumberHigherorLower2{
	public int guessNumber(int n) {
		return binarySearch(1,n);
	}
	public int binarySearch(int lo, int hi){
		int mid = lo+(hi-lo)/2;
		int param = guess(mid);
		if(param==1){
			return binarySearch(mid+1,hi);
		}
		if(param==-1){
			return binarySearch(lo,mid-1);
		}
		if(param==0){
			return mid;
		}
		return hi;
	}
}