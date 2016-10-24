/*The time complicity is O(n)*/
public class ContainsDuplicate2{
	public static void main(String []args){

	}
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(set.contains(nums[i])){
				return true;
			}else{
				set.add(nums[i]);
			}
		}
		return false;
	}
}