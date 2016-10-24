public class HouseRobber{
	public static void main(String[] args){
		System.out.println(rob(new int[]{1,2,3,4,5}));
	}
    public static int rob(int[] nums) {
	    if(nums.length==0) return 0;
    	if(nums.length==1) return nums[0];
        int mark[] = new int[nums.length];
        mark[0] = nums[0];
        mark[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
        	mark[i] = Math.max(nums[i]+mark[i-2],mark[i-1]);
        }
        return mark[nums.length-1];
    }
}