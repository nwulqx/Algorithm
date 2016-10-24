/*I use another int Array,but I think it's not a good method!
There must be another more efficient method!
*/
public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int tmp[] = new int[n+m];
    	int i=0 , j=0;
    	for(int k = 0;k<m+n;k++){
    		if(i==m) tmp[k] = nums2[j++];
    		else if(j==n) tmp[k] = nums1[i++];
    		else if(nums1[i]<nums2[j]){
    			tmp[k] = nums1[i++];
    		}else{
    			tmp[k] = nums2[j++];
    		}
    	}
    	int k = 0;
    	for(int num : tmp){
    		nums1[k++] = num;
    	}
    }
}