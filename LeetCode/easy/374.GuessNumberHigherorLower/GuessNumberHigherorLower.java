/*Using while loop!
*/
public class GuessNumberHigherorLower{
   	public int guessNumber(int n) {
   		int lo = 1;
   		int hi = n;
   		while(lo<=hi){
   			/*This will cause stackoverflow!
   			int mid = (hi+lo)/2;
   			*/
   			int mid = lo+(hi-lo)/2;
   			int param = guess(mid);
   			if(param==1){
   				lo = mid+1;
   			}else if(param==-1){
   				hi = mid-1;
   			}else{
   				return mid;
   			}
   		}
   		return n;
    }
}