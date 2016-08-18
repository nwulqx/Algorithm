import java.util.*;
/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

this method is a Brute Forced method
it's 
time completicity is O(n2);
space complicity is O(1);because
*/
public class TwoSum {
	public static void main(String []args){
		TwoSum ts = new TwoSum();
		int []nums = {-1,-2,-3,-4,-5};
		int target = -8;
		int []ret = ts.twoSum(nums,target);
		System.out.println(Arrays.toString(ret));
	}
    public int[] twoSum(int[] nums, int target) {
    	int []ret = new int[2];
    	for(int i=0,j=i;i<nums.length;i++){
    			int tmp = target-nums[i];
    			if(ret[1]==0){
    				ret[0] = i; 
					ret[1] = this.find(nums,tmp,++j);
    			}else
    				break;
    	}
    	return ret;
    }
    public int find(int[] nums,int target,int lo){
    	int ret = 0;
    	for(int i=lo;i<nums.length;i++){
    		if(target<nums[i]) continue;
    		if(target == nums[i]){
    			ret = i;
    			break;
    		}
        }
        return ret;
    } 
}