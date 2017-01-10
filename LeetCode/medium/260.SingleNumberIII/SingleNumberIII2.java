public class SingleNumberIII2{
	public int[] singleNumber(int[] nums) {
		int bit = 0;
		for(int i=0;i<nums.length;i++){
			bit ^= nums[i];
		}
		bit = bit ^ (-bit);
		int sign1 = 0;
		int sign2 = 0;
		for(int i=0;i<nums.length;i++){
			if((nums[i]&bit)==0){
				sign1 ^= nums[i];
			}else{
				sign2 ^= nums[i];
			}
		}
		return new int[]{sign1,sign2};
	}
}