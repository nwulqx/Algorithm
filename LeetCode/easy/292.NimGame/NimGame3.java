public class NimGame3{
	public static void main(String []args){
		System.out.println(canWinNim(4));
	}
	public static boolean canWinNim(int n) {
		boolean b[] = new boolean[n];
		for(int i=1;i<n+1;i++){
			if(i==1||i==2||i==3){
				b[i-1] = true;
				continue;
			}
			b[i-1] = !(b[i-2]&&b[i-3]&&b[i-4]);
		}
		return b[n-1];
	}
}