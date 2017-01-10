/*the time complicity is O(lon2N+n2)
beacuse the array's sort cost log2N，there 
is two for loops.
*/
import java.util.*;
public class ThreeSum{
	public static void main(String []args){
		// int b[] = {1,3};
		// System.out.println(Arrays.binarySearch(b,0,,3));

		int []a = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> list = threeSum(a);
		System.out.println(list.toString());
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	 	Arrays.sort(nums);
	 	System.out.println(Arrays.toString(nums));
	 	List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0;i < nums.length;i++){
        	if(i>0&&nums[i]==nums[i-1]) continue;
        	for(int j = i+1;j < nums.length;j++){
        		if(j>i+1&&nums[j]==nums[j-1]) continue;
        		int twosum = nums[i] + nums[j];
        		int k = Arrays.binarySearch(nums,j+1,nums.length,-twosum);
    			System.out.println("2sum:"+twosum+"---k:"+k);
        		if(k>=0){
	        		List<Integer> list = new ArrayList<Integer>();
	        		list.add(nums[i]);
	        		list.add(nums[j]);
	        		list.add(nums[k]);
	        		result.add(list);
        		}
        	}
        }
        return result;
    }
}