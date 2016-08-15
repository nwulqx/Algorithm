import java.util.*;
public class QuickTest{
	public static void main(String []args){
		// int []a = {4,3,4,21,11/*,2,1,5,6,7,8,10*/};
		int a[] = {4,3,4,5};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static boolean less(int a,int b){
		return a-b<0?true:false;
	}
	public static void exch(int []a,int i,int j){
		if(i==j) return;
		System.out.println("exch触发");
		a[i] = a[i]^a[j];
		a[j] = a[i]^a[j];
		a[i] = a[i]^a[j];
	}
	public static int partition(int []a,int lo,int hi){
		int i = lo;
		int j = hi+1;
		while(true){
			System.out.println("数组："+Arrays.toString(a));
			//从左边依次查找>a[lo]的数
			while(less(a[++i],a[lo])){
				if(i==hi) break;
			}
			System.out.println("数字i:"+i);
			//从右边依次查找<a[lo]的数
			while(less(a[lo],a[--j])){
				if(j==lo) break;
			}
			System.out.println("数字j:"+j);
			if(i>=j) break;
			exch(a,i,j);
		}
		if(j==lo) return j;
		exch(a,lo,j);
		return j;
	}
	public static void sort(int []a){
		sort(a,0,a.length-1);
	}
	public static void sort(int []a,int lo,int hi){
		if(lo>=hi) return;
		int j = partition(a,lo,hi);
		sort(a,j+1,hi);
		sort(a,0,j-1);
	}
}
/* *
[4, 3, 2, 1]
数组：[4, 3, 2, 1]
数字i:3
数字j:3
数组：[1, 3, 2, 4]
数字i:1
数字j:0
数组：[1, 3, 2, 4]
数字i:2
数字j:2
数组：[1, 2, 3, 4]
数字i:1
数字j:0
[1, 2, 3, 4]
*/