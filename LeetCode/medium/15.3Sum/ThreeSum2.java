import java.util.*;

public class ThreeSum2{
	public static void main(String []args){
		int []a = {-2,0,0,2,2};
		List<List<Integer>> list = threeSum(a);
		System.out.println(list.toString());
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	 	Arrays.sort(nums);
	 	List<List<Integer>> result = new ArrayList<List<Integer>>();
	 	for(int i=0;i<nums.length-2;i++){
	 		if(i>0&&nums[i]==nums[i-1]) continue;
	 		int lo = i+1;
	 		int hi = nums.length-1;
	 		while(lo<hi){
	 			if(lo>i+1&&nums[lo]==nums[lo-1]){
	 				lo++;
	 				continue;
	 			}else if(hi<nums.length-1&&nums[hi]==nums[hi+1]){
	 				hi--;
	 				continue;
	 			}
	 			if(nums[lo]+nums[hi]==-nums[i]){
	 				result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
	 				lo++;
	 				hi--;
	 			}
	 			else if(nums[lo]+nums[hi]<-nums[i]) lo++;
	 			else hi--;
	 		}
		}
		return result;
    }
}