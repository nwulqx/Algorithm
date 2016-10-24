import java.util.*;
/*A very smart method!!!*/
public class MoveZeroes{
	public static void main(String []args){
		int nums[] = {0,0,1};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
    public static void moveZeroes(int[] nums) {
    	int length = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=0) nums[length++] = nums[i];
    	}
    	while(length < nums.length){
    		nums[length++] = 0;
    	}
    }
}