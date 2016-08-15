import java.util.*;
public class QuickSort{
	public static void main(String[] args){
		/*int a[] = {1,2,3};
		System.out.print(Arrays.toString(a));
		exch(a,0,1);
		System.out.print(Arrays.toString(a));*/
		int j ;
		int a[] = {4,3,2,4,1};
		/*j= combination(a,0,3);
		j = combination(a,0,j-1);
		j = combination(a,j+1,2);
		System.out.print(Arrays.toString(a)+"\n\rj="+j);*/
		sort(a);
	}
	/*
		小于判断，a<b。返回true；
		a>b，返回false。
	*/
	public static boolean less(int a,int b){
		return a-b<0?true:false;
	}
	public static void exch(int[] a,int i,int j){
		System.out.println("beforeexch:"+Arrays.toString(a));
		/*^异或运算下的交换元素，不能针对同一个元素自身更换，所以数组想要自身更换，还是不要用
		例如：a=a^a;此时a=0;自身怎么运算就都是0了
		*/
		a[i] = a[i]^a[j];
		a[j] = a[i]^a[j];
		a[i] = a[i]^a[j];
		System.out.println("afterexch:"+Arrays.toString(a));
	}
	public static int combination(int []a,int lo,int hi){
		int i = lo;
		int j = hi+1;
		while(true){
			//从左边逐个寻找大于a[lo]的数
			while(less(a[++i],a[lo]))
				if(i==hi) break;
			//从右边逐个寻找小于a[lo]的数
			while(less(a[lo],a[--j]))
				if(j==lo) break;
			if(i>=j) break;
			exch(a,i,j);
		}
		if(j==lo) return j;
		exch(a,lo,j);
		return j;
	}
	public static void sort(int []a,int lo,int hi){
		if(hi<=lo) return;
		int j = combination(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	public static void sort(int []a){
		sort(a,0,a.length-1);
	}
}