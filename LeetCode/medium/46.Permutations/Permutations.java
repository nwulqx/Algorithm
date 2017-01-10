public class Permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        help(result,nums,0);
        return result;
    }
    public void help(List<List<Integer>> result, int[] nums,int begin){
    	if(begin>=nums.length){
    		List<Integer> asList = new ArrayList<Integer>();
    		for(int j : nums)
    			asList.add(j);
    		result.add(asList);
    		return;
    	}
    	for(int i=begin;i<nums.length;i++){
    		swap(nums,i,begin);
    		help(result,nums,begin+1);
    		swap(nums,i,begin);
    	}
    }
    public void swap(int nums[],int i,int j){
    	if(i!=j){
    		nums[i] = nums[i] ^ nums[j];
    		nums[j] = nums[i] ^ nums[j];
    		nums[i] = nums[i] ^ nums[j];
    	}
    }
}