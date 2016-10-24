import java.util.*;
/*My bad solution!*/
public class SingleNumber{
	public static void main(String []args){
		int nums[] = {1,1,2};
		System.out.println(singleNumber(nums));
	}
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
        	if(i%2==1&&nums[i-1]!=nums[i])
        		return nums[i-1];
        	continue;
        }
        if(nums.length%2==1)
        	return nums[nums.length-1];
        else
        	return 0;
    }
}