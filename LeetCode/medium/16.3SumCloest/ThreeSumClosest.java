/*Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

neet to be optimized!!!!
*/
import java.util.*;
public class ThreeSumClosest{
	public static void main(String []args){
		int []S = {1,1,1,0};
		System.out.println(threeSumClosest(S,-100));
	}
	/*
	neet to be optimized!!!!
	*/
    public static int threeSumClosest(int[] nums, int target) {
    	if(nums.length<3) new Exception("The Array's length is less than 3");
    	Arrays.sort(nums);
    	int temp, lo, hi, result=nums[0]+nums[1]+nums[nums.length-1];
    	int closest = Math.abs(nums[1]+nums[nums.length-1]-target + nums[0]);
        for(int i=0;i<nums.length-2;i++){
        	if(i>0 && nums[i] == nums[i-1]) continue;
        	temp = target - nums[i];
        	lo = i+1;
        	hi = nums.length-1;
        	while(lo<hi){
        		if(lo>i+1 && nums[lo] == nums[lo-1]){
        			lo++;
        			continue;
        		}
        		if(hi<nums.length-1 && nums[hi] == nums[hi+1]){
        			hi--;
        			continue;
        		}
    			if(closest>Math.abs(nums[lo]+nums[hi]-temp)){
        				closest = Math.abs(nums[lo]+nums[hi]-temp);
        				result = nums[i]+nums[lo]+nums[hi];
    			}
        		if(temp>(nums[lo]+nums[hi]))
        			lo++;
        		else
        			hi--;
        	}
        }
        return result;
    }
}