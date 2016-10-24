/*Using one loop can easy solving this problem,
it is a very smart method!
*/
public class BestTimetoBuyandSellStock{
	public static void main(String []args){
	}
 	public static int maxProfit(int[] prices) {
 		if(prices.length == 0) return 0;
        int profit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
        	if(prices[i]>buy){
        		if(prices[i]-buy>profit){
        			profit = prices[i]-buy;
        		}
        	}else{
        		buy = prices[i];
        	}
        }
        return profit;
    }
}