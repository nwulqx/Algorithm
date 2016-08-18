import java.util.*;
/*
通过HashMap来存储键值对，HashMap使用红黑树实现，查找效率比遍历查询效率高
一点疑惑：[{0,-2,0,0},0],对于这样的查询，HashMap中存放了相同的key的情况，是覆盖了前面
两个0的索引，所以答案是(0,3);
*/

public class TwoSum3{
	public static void main(String []args){
		System.out.print(
			Arrays.toString(
				twoSum(new int[] {0,-2,0,0},0)
			)
		);
	}
	public static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int j=0;j<nums.length;j++){
			 
			if(map.containsKey(target-nums[j])&&(map.get(target-nums[j])!=j)){
				return new int[] {j,map.get(target-nums[j])};
			}
		}
		throw new IllegalArgumentException("No Such Two Arguments");
	}
}