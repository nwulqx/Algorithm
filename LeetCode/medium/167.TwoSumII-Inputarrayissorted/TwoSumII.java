/*Need optimized when using two index!
*/
public class TwoSumII{
    public int[] twoSum(int[] numbers, int target) {
    	if(target<numbers[0])
    		throw new IllegalArgumentException("No Such Two Arguments");
    	int low = 0;
    	int high = numbers.length-1;
    	while(low<high){
    		// Optimized begin!
    		if(low>0 && numbers[low]==numbers[low-1]){
    			low++;
    			continue;
    		}
    		if(high<numbers.length-1 && numbers[high]==numbers[high+1]){
    			high--;
    			continue;
    		}
    		//Optimized end!
    		if(numbers[low]+numbers[high]<target)
    			low++;
    		else if(numbers[low]+numbers[high]>target)
    			high--;
    		else
    			return new int[]{low+1,high+1};
    	}
        throw new IllegalArgumentException("No Such Two Arguments");
    }
}