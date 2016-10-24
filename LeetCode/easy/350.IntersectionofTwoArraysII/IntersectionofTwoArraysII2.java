/*O(n) time and O(n) space.
Having better method!
beats : % 
*/
import java.util.*;
public class IntersectionofTwoArraysII{
	public static void main(String []args){
		System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},new int[]{2,2})));
	}
    public static int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(map.containsKey(num)&&map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
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