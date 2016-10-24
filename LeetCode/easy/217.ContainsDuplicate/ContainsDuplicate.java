/*Time complicity is O(n log n)
beats : 85%
*/
import java.util.*;
public class ContainsDuplicate{
	public static void main(String[] args){

	}
    public static boolean containsDuplicate(int[] nums) {
    	if(nums.length==0 || nums.length==1) return false;
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++){
    		if(i>0&&nums[i]==nums[i-1]){
    			return true;
    		}
    	}
    	return false;
    }
}