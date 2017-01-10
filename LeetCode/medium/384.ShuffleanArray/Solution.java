public class Solution {

	int array[] = null;
    public Solution(int[] nums) {
        this.array = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return array;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	int result[] = new int[array.length];
    	int k = 0;
    	for(int num : array){
    		result[k++] = num;
    	}
    	Random generator = new Random();
        for(int i=result.length-1;i>=0;i--){
        	int index = generator.nextInt(i+1);
        	if(index!=i){
        		result[i] = result[i] ^ result[index];
        		result[index] = result[i] ^ result[index];
        		result[i] = result[i] ^ result[index];
        	}
        }
        return result;
    }
}