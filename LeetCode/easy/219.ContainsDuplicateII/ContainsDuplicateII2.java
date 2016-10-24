/*Using array;
*/
public class ContainsDuplicateII2{
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length<2) return false;
		/*When k > nums.length,we can use another method judge! */
		if(k >= nums.length){
			Arrays.sort(nums);
			for(int i=1;i<nums.length;i++){
				if(nums[i] == nums[i-1])
					return true;
			}
			return false;
		}
		int min = nums[0];
		int max = nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]<min) min = nums[i];
			if(nums[i]>max) max = nums[i];
		}
		int array[] = new int[max-min+1];
		for(int i=0;i<nums.length;i++){
			if(array[nums[i]-min]==0)
				array[nums[i]-min] = i+1;
			else if(i-array[nums[i]-min]+1 <= k)
				return true;
			else
				array[nums[i]-min] = i+1;
		}
		return false;
	}
}