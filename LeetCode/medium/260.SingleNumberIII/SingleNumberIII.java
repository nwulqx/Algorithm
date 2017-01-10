public class SingleNumberIII{
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<int> list = new ArrayList<int>();
        for(int i=0;i<nums.length;i++){
        	if(i>0 && nums[i]==nums[i-1])
        		continue;
        	if(i<nums.length-1 && nums[i]==nums[i+1])
        		continue;
        	list.add(nums[i]);
        }
        int result[] = new int[list.size()];
        int k=0;
        for(int num : list){
        	result[k++] = num;
        }
        return result;
    }
}