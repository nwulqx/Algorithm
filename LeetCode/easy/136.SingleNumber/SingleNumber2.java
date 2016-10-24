/*use the xor(^) operator ,because A XOR A = 0 */
public class SingleNumber2{
	public static void main(String []args){
		int nums[] = {1};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result ^= nums[i];
		}
		return result;
	}
}