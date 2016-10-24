/*We can use HashMap to solve this problem!
We can also use array to solve this problem!!
*/
public class ContainsDuplicateII{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	Integer j = map.put(nums[i],i);
        	if(j!=null && ((i-j)<=k))
        		return true;
        }
        return false;
    }
}