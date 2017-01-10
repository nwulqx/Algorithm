/* O(1) extra space
*/
public class RotateArray2{
	public void rotate(int[] nums, int k) {
		int size = nums.length;
		for(int j = 0;j<k;j++){
			int tmp = nums[size-1];
			for(int i=size-1;i>0;i--){
				nums[i] = nums[i-1];
			}
			nums[0] = tmp;
		}
	}
}