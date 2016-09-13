public class RemoveDuplicatesfromSortedArray{
	public static void main(String []args){
		int nums[] = new int[]{1,1,1,1,1,1,2,2,2,2};
		int length = removeDuplicates(nums);
		for (int i = 0;i<length;i++ ) {
			System.out.println(nums[i]);	
		}
	}
    public static int removeDuplicates(int[] nums) {
        int length = 0;
        for(int i=0;i<nums.length;i++){
        	if(i>0 && nums[i] == nums[i-1])
        		continue;
        	nums[length] = nums[i];
        	length++;
        }
        return length;
    }
}