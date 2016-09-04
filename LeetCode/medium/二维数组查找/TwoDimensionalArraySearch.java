public class TwoDimensionalArraySearch{
	private static int INDEX=0;
	public static void main(String []args){
/*		int a[][] = {
			{1,2,8,11},
			{2,4,9,12},
			{4,7,10,13},
			{6,8,12,18},
			{8,10,13,20},
			{12,13,17,25},
			{19,22,25,30},
			{20,25,27,40},
			{25,30,35,44},
			{26,45,48,50}};*/
			// int a[][] = {{}};
			int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			System.out.println(search(a,3,0,a.length-1,0,a[0].length-1)+"--index:"+INDEX);
			// System.out.println(a.length==1);
			// System.out.println(search(a,9,0,a.length-1,0,a[0].length-1)+"--index:"+INDEX);
		// System.out.println(binarySearch(a,4,0,4));
	}
	/*use recursion to solve binarySearch*/
/*	public static int binarySearch(int a[],int key,int lo,int hi){
		if(lo<=hi){
			int mid = (lo+hi)/2;
			if(key>a[mid]) return binarySearch(a,key,mid,hi);
			else if(key<a[mid]) return binarySearch(a,key,lo,mid);
			else return mid;
		}
		return -1;
	}*/
	/*statnded method to solve binarySearch loop*/
	public static int binarySearch(int a[],int key,int lo,int hi){
		int i = lo;
		int j = hi;
		int mid = -1;
		if(key<a[lo]||key>a[hi]) return -1;
		while(i<=j){
			mid = (i+j)/2;
			if(key>a[mid]) i=mid+1;
			else if(key<a[mid]) j = mid-1;
			else return mid;
		}
		return j;
	}
	public static boolean search(int a[][],int key,int m1,int m2,int n1,int n2){
		int begin_m1 = m1, begin_n1 = n1, end_m2 = m2, end_n2 = n2;
		boolean left_result = false,  right_result = false;
		int i = (m1+m2)/2,j = (n1+n2)/2;
		if (a[0].length==0)  
                return false;
		if(key<a[m1][n1]||key>a[m2][n2]) return false;
		else if(key==a[m1][n1]||key==a[m2][n2]) return true;
		while(i!=m1 || j!=n1){
			INDEX++;
			if(key==a[i][j])
				return true;
			else if(key>a[i][j]){
				m1 = i;
				n1 = j;
				i = (m2+i)/2;
				j = (n2+j)/2;
			}else{
				m2 = i;
				n2 = j;
				i = (m1+i)/2;
				j = (n1+j)/2;
			}
		}
		if(i<end_m2)
			left_result = search( a, key, i+1, end_m2, begin_n1, j);
		if(j<end_n2)
			right_result = search(a, key, begin_m1, i, j+1, end_n2);
		return left_result || right_result;
	}
}