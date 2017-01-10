public class TwoSumII2{
    public int[] twoSum(int[] numbers, int target) {
    	if(target<numbers[0])
    		throw new IllegalArgumentException("No Such Two Arguments");
        int lo=0, hi=numbers.length-1;
        while (numbers[lo]+numbers[hi]!=target){
            if (numbers[lo]+numbers[hi]<target){
                lo++;
            } else {
                hi--;
            }
        }
        if(lo<hi){
        	return new int[]{lo+1,hi+1};
        }else{
        	throw new IllegalArgumentException("No Such Two Arguments");
        }
    }
}