public class MissingNumber{
    public int missingNumber(int[] nums) {
    	int sum1 = (0+len)*(len+1)/2;
    	int sum2 = 0;
    	for(int i=0;i<nums.length;i++){
    		sum2 += nums[i];
    	}
    	return sum1 - sum2;
    }
}