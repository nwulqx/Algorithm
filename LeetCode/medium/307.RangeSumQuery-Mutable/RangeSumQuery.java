// Time Limit Exceeded, we need to use segment tree.
public class RangeSumQuery{
	private int num[];
	private Integer sum;
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
        	num[i] = nums[i];
        }
    }

    void update(int i, int val) {
        num[i] = val;
    }

    public int sumRange(int i, int j) {
    	sum = 0;
        for(int k=i;k<=j;k++){
        	sum += num[k];
        }
        return sum;
    }

}