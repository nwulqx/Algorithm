/*http://www.w2bc.com/article/120965*/
public class NimGame2{
	public static void main(String []args){
		System.out.println(canWinNim(5));
	}
    public static boolean canWinNim(int n) {
    	if(n<0)
    		return false;

    	if(n>0&&n<4)
    		return true;

    	else
    		return !(canWinNim(n-1)&&canWinNim(n-2)&&canWinNim(n-3));
	 }
}