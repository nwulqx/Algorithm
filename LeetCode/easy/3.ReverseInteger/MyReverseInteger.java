public class MyReverseInteger{
	public static void main(String []args){
		int i = 2147483647;
		System.out.println(reverse(i));
	}
    public static int reverse(int x) {
    	int tmp = Math.abs(x);
        StringBuffer sb = new StringBuffer(tmp+"");
			sb.reverse();
			try{
				return (x>0?Integer.parseInt(sb.toString()):-Integer.parseInt(sb.toString()));
			}catch(NumberFormatException e){
				return 0;
			}
    }
}