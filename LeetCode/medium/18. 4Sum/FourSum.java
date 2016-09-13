/*The time complicity is O(nlogn+n3)
*/
import java.util.*;
public class FourSum{
	public static void main(String []args){
		int s[] = {-1,2,2,-5,0,-1,4};
		List<List<Integer>> list = fourSum(s,3);
		System.out.println(list.toString());
	}
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
        	if(i>0 && nums[i]==nums[i-1]) continue;
        	for(int j=i+1;j<nums.length-2;j++){
        		if(j>i+1 && nums[j]==nums[j-1]) continue;
        		int n = j+1;
        		int m = nums.length-1;
        		System.out.println("start:i:"+i+" j:"+j+" n:"+n+" m:"+m);
        		while(m>n){
        			System.out.println("while:i:"+i+" j:"+j+" n:"+n+" m:"+m);
        			if(n>j+1 && nums[n]==nums[n-1]){
        				n++;
        				continue;
        			}
        			/*err1*/
        			if(m<nums.length-1 && nums[m] == nums[m+1]){
        				m--;
        				continue;
        			} 
        			if(nums[i]+nums[j]+nums[n]+nums[m] == target){
        				List<Integer> list = new ArrayList<Integer>();
        				list.add(nums[i]);
        				list.add(nums[j]);
        				list.add(nums[m]);
        				list.add(nums[n]);
        				result.add(list);
        				n++;
        				m--;
        			}
        			else if(nums[i]+nums[j]+nums[n]+nums[m] > target)
        				m--;
        			else 
        				n++;
        		}
        	}
        }
        return result;
    }
}