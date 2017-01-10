public class ProductofArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int first[] = new int[nums.length];
        int p = 1;
        for(int i=0;i<nums.length;i++){
        	first[i] = p;
        	p *= nums[i];
        }
        int second[] = new int[nums.length];
        int q = 1;
        for(int i=nums.length-1;i>=0;i--){
        	second[i] = q;
        	q *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
        	nums[i] = first[i]*second[i];
        }
        return nums;
    }
}