/*The sort algorithm's smallest time complicity is O(n*log n)
So this method time complicity is O(n*log n)
*/
public class MajorityElement{
	public static void main(String []args){

	}
    public static int majorityElement(int[] nums) {
    	Arrays.sort(nums);
    	return nums[(nums.length-1)/2];
    }
}