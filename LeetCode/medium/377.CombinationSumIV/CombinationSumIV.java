/*Using recursion ，but having a time limited problem!
*/
public class CombinationSumIV{
    public int combinationSum4(int[] nums, int target) {
        if(target==0)
        	return 1;
        int i = 0;
        for(int j=0;j<nums.length;j++){
        	if((target-nums[j])>=0){
        		i += combinationSum4(nums,target-nums[j]);
        	}
        }
        return i;
    }
}