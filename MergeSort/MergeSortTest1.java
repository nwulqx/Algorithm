import java.util.*;
/*one day after
一天测试
*/
public class MergeSortTest1{
	public static void main(String []args){
		int a[] = {1,5,8,7,5,4,2};
		int []b = new int[a.length];
		merge(a,b,0,3,a.length-1);
		sort(a);
		System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));
	}
	public static boolean less(int a,int b){
		return a-b<0;
	}
	public static void merge(int []a,int []b,int lo,int mid,int hi){
		int i = lo;
		int j = mid+1;
		for(int k=lo;k<=hi;k++){
			if(i>mid) b[k] = a[j++];
			else if(j>hi) b[k] = a[i++];
			else if(less(a[i],a[j])) b[k] = a[i++];
			else b[k] = a[j++];
		}
	}
	public static void sort(int a[],int b[],int lo,int hi){
		if(lo>=hi) return;
		int mid = lo + (hi-lo)/2;
		sort(b,a,lo,mid);
		sort(b,a,mid+1,hi);
		merge(b,a,lo,mid,hi);
	}
	public static void sort(int []a){
		int []b = new int[a.length];
		for(int i = 0;i<a.length;i++)
			b[i] = a[i];
		sort(a,b,0,a.length-1);
	}
}