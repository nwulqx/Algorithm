public class RemoveElement{
	public static void main(String []args){
		int nums[] = new int[]{1,1,1,1,1,1,2,2,2,2};
		int length = removeElement(nums,2);
		for (int i = 0;i<length;i++ ) {
			System.out.println(nums[i]);	
		}
	}
    public static int removeElement(int[] nums, int val) {
        // length is the return array's length
        int length = 0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i] == val) 
        		continue;
            //we can also use length as index to cover val
        	nums[length] = nums[i];
        	length++;
        }
        return length;
    }
}