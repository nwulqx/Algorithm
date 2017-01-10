import java.util.*;
/*
This method is also a Brute Forced method.

time completicity is O(n2);
space complicity is O(1);
beats: 25%;
*/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ret[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int aim = target - nums[i];
            if(ret[1]==0){
                ret[0] = i;
                ret[1] = find(nums,aim,i+1);
            }
        }
        return ret;
    }
    public int find(int[] nums,int target,int lo){
        for(int i=lo;i<nums.length;i++){
            if(target == nums[i])
                return i;
        }
        return 0;
    }
}