/*some other method to solve problem*/
public class TwoDimensionalArraySearch2{
	public static void main(String []args){
	/*		int a[][] = {
			{1,2,8,9},
			{2,4,9,12},
			{4,7,10,13},
			{6,8,11,18},
			{8,10,13,20},
			{12,13,17,25},
			{19,22,25,30},
			{20,25,27,40},
			{25,30,35,44},
			{26,45,48,50}};*/
			int a[][] = {{}};
			// System.out.println(a.length==1);
			System.out.println(search(a,26));
	}
	public static boolean search(int a[][],int key){
		if(a[0].length==0)
			return false;
		int i = 0;
		int j = a[0].length-1;
		while(j>=0 || i<a.length){
			if(j==0){
				if(a[i][j]<key) i++;
				else if(a[i][j]>key) return false;
				else return true;
			}else if(i==a.length-1){
				if(a[i][j]>key) j--;
				else if(a[i][j]<key) return false;
				else return true;
			}else{
				if(a[i][j]<key) i++;
				else if(a[i][j]>key) j--;
				else return true;
			}
		}
		return false;
	}
}