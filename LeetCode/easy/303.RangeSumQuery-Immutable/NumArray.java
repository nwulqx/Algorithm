/*You may assume that the array does not change.
There are many calls to sumRange function.
My solution is Time Limit Exceeded!!
There are some points need to optimized!
If we just need to get sum of the elements between indices i and j,
we can store sum of the elements between indices 0 and i.
*/
public class NumArray {
	private int nums[] = null;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
        	nums[i] = nums[i-1]+nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
    	if(i==0)
    		return nums[j];
    	else
        	return nums[j]-nums[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);