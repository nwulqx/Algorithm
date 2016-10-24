public class NimGame4{
	public static void main(String []args){
		System.out.println(canWinNim(9));
	}
	public static boolean canWinNim(int n) {
	 	boolean canWin = false;
		boolean b[] = new boolean[3];
		for(int i = 1;i<=n;i++){
			if(i==1||i==2||i==3){
				b[i-1] = true;
				canWin = true;
				continue;
			}
			canWin = !(b[0]&&b[1]&&b[2]);
			b[0] = b[1];
			b[1] = b[2];
			b[2] = canWin;
		}
		return b[2];
	}
}