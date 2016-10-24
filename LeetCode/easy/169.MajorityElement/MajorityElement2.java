/*This method time complicity is O(n)
because of the XOR!
*/
public class MajorityElement2{
	public static void main(String []args){

	}
	public int majorityElement(int[] nums) {
		int major = nums[0],count = 1;
		for(int i=1;i<nums.length;i++){
			if(count == 0){
				major = nums[i];
				count++;
			}else if(major == nums[i]){
				count++;
			}else{
				count--;
			}
		}
		return major;
	}
}