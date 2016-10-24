/*O(nlogn) time and O(1) space.
Having better method!
beats : 59% 
*/
import java.util.*;
public class IntersectionofTwoArraysII{
	public static void main(String []args){
		System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},new int[]{2,2})));
	}
    public static int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0;
        while(i<nums1.length && j<nums2.length){
        	if(nums1[i] > nums2[j]){
        		j ++;
        	}else if(nums1[i] < nums2[j]){
        		i ++;
        	}else{
        		list.add(nums1[i]);
        		i++;
        		j++;
        	}
        }
        int result[] = new int[list.size()];
        int k = 0;
        for(int num : list){
        	result[k++] = num;
        }
        return result;
    }
}