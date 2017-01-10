import java.util.*;
/*
Beats : 45%;
Time complicity is O(n);
Space complicity is O(n);
*/
public class TwoSum3{
	public static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int j=0;j<nums.length;j++){
			 // We don't need two same elements!
			if(map.containsKey(target-nums[j])&&(map.get(target-nums[j])!=j)){
				return new int[] {j,map.get(target-nums[j])};
			}
		}
		throw new IllegalArgumentException("No Such Two Arguments");
	}
}