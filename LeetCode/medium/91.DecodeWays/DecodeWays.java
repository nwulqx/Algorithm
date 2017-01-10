public class DecodeWays{
	public static void main(String []args){
		System.out.println(numDecodings("10"));
		// System.out.println(Integer.parseInt("010")); // 10;
	}
    public static int numDecodings(String s) {
        int n = s.length();
        if(n == 0)
        	return 0;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0'?1:0;
        for(int i=2;i<n+1;i++){
        	Integer num1 = Integer.parseInt(s.substring(i-1,i));
        	Integer num2 = Integer.parseInt(s.substring(i-2,i));
        	if(num1!=0)
        		dp[i] += dp[i-1];
        	if(num2>=10 && num2<=26)
        		dp[i] += dp[i-2];
        }
        return dp[n];
    }
}