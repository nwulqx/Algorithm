/*Using extro O(n) space!
*/
public class RotateArray{
    public void rotate(int[] nums, int k) {
    	int size = nums.length;
        int result[] = new int[size];
        for(int i=0;i<nums.length;i++){
        	result[(i+k)%size] = nums[i];
        }
        int j = 0;
        for(int num : result){
        	nums[j++] = num;
        }
    }
}