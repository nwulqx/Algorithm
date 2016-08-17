import java.util.*;
public class MergeSort{
	public static void main(String []args){
		int []a = {4,5,6,7,1/*,2,4,0,12,1*/};
		// int []b = new int[a.length];
		// merge(a,b,0,3,a.length-1);
		// int []b = {4,5,6,7,1,2,3,4};
		int []b = {4,5/*,6,7,1,2,3,0,12,1*/};
		sort(a);
		System.out.print(Arrays.toString(a));
	}
	public static boolean less(int a,int b){
		return a-b<0?true:false;
	}
	/* 归并思想，将两个有序数组合并为一个有序数组
	@param a:待合并数组
	@param b:合并后的数组
	@param lo:待合并数组1的开始
	@param mid:待合并数组1的结束
	@param hi:待合并数组2的结束
	 */
	public static void merge(int []a,int []b,int lo,int mid,int hi){
		int i = lo,j = mid+1;
		for(int k = lo;k<=hi;k++){
			if(i>mid) b[k] = a[j++];
			else if(j>hi) b[k] = a[i++];
			else if(less(a[i],a[j])) b[k] = a[i++];
			else b[k] = a[j++];
		}
	}
	/*
	递归实现：类似于汉诺塔的实现
	不关注整体的实现，关注与一次的实现。
	*/
	public static void sort(int []a,int []b, int lo,int hi){
		if(lo>=hi) return;
		int mid = lo + (hi-lo)/2;
		sort(b,a,lo,mid);
		sort(b,a,mid+1,hi);
		merge(a,b,lo,mid,hi);
	}
	public static void sort(int a[]){
		int b[] = new int[a.length];
		for(int i =0;i<a.length;i++)
			b[i] = a[i];
		sort(b,a,0,a.length-1);
	}
}