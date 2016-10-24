import java.util.*;
public class IntersectionofTwoArrays3{
	public static void main(String []args){
		// System.out.println(Arrays.toString(intersection(new int[]{2,2},new int[]{2,2})));
			int j = 0;
			long t1=System.currentTimeMillis();
			for(int i=0;i<202340000;i++)
				if(true)
					j++;
			long t2=System.currentTimeMillis();
			System.out.println(t2-t1);
			j = 0;
			long t3=System.currentTimeMillis();
			for(int i=0;i<202340000;i++){
				if(true){
					j++;
				}
			}
			long t4=System.currentTimeMillis();
			System.out.println(t4-t3);
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0,j=0;
		while(i<nums1.length && j<nums2.length){
			if(nums1[i]<nums2[j]){
				i++;
			}
			else if(nums1[i]>nums2[j]){
				j++;
			}
			else{
				set.add(nums1[i]);
				i++;
				j++;
			}
		}
		int result[] = new int[set.size()];
		int k = 0;
		for(Integer num : set){
			result[k++] = num;
		}
		return result;
	}
}