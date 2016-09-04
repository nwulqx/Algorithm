public class ReverseInteger{
	public static void main(String []args){
		int i = 2147483647;
		System.out.println(reverse(i));
	}
    public static int reverse(int x) {
    	long result = 0;
        int tmp = Math.abs(x);
        while(tmp>0){
        	result*=10;
        	result += tmp%10;
        	if(result>Integer.MAX_VALUE)
        		return 0;
        	tmp/=10;
        }
        return (int)(x>0?result:-result);
    }
}