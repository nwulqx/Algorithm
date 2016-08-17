public class Merge{
	public static void main(String []args){
		hanoi("source","mid","destination",4);
	}
	public static void hanoi(String sour,String mid,String dst,int n){
		if(n>0){
			hanoi(sour,dst,mid,n-1);
			System.out.println("第"+n+"层"+":"+sour+"-->"+dst);
			hanoi(sour,mid,dst,n-1);
		}
	}
}