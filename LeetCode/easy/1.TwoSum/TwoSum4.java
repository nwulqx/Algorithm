import java.util.*;
/*
This method is found the 2 nums sum is target ,but the return isn't the index!
*/
public class TwoSum4{
	public static void main(String []args){
		System.out.print(
			Arrays.toString(
				twoSum(new int[] {2, 7, 11, 15},9)
			)
		);
	}
	/*the return isn't index,it is a array of values*/
	public static int[] twoSum(int[] nums, int target){
		Arrays.sort(nums);
		int lo = 0;
		int hi = nums.length-1;
		while(lo<hi){
			if(nums[lo]+nums[hi]==target) return new int[]{nums[lo],nums[hi]};
			else if(nums[lo]+nums[hi] > target) hi--;
			else lo++;
		}
		throw new IllegalArgumentException("No Such Two Arguments");
	}
}