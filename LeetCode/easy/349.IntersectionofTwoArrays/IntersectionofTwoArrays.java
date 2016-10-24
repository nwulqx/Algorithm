import java.util.*;
public class IntersectionofTwoArrays{
	public static void main(String []args){
		System.out.println(Arrays.toString(intersection(new int[]{},new int[]{2,2})));
	}
    public static int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
        	for(int j=0;j<nums2.length;j++){
        		if(nums1[i]==nums2[j])
        			set.add(nums1[i]);
        	}
        }
        int result[] = new int[set.size()];
        int index = 0;
        Iterator it = set.iterator();
        while(it.hasNext()){
        	result[index++] = (int)it.next();
        }
        return result;
    }
}