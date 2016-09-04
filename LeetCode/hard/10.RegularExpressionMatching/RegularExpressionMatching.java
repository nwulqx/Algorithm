public class  RegularExpressionMatching{
	public static void main(String args[]){
        System.out.print(true||(true||false)&&false);
		// System.out.print("aab".matches("b.*"));
        // System.out.print(isMatch("aab","b.*"));
	}
    public static boolean isMatch(String s, String p) {
        boolean f[][] = new boolean[s.length()+1][p.length()+1];
        f[0][0] = true;
        //
        for(int i=1;i<f[0].length;i++){
            f[0][i] = i>1 && p.charAt(i-1) =='*' && f[0][i-2];
        }
        for(int i=1;i<s.length()+1;i++){
            f[i][0] = false;
        }
        for(int i=1;i<s.length()+1;i++){
            for(int j=1;j<f[0].length;j++){
                if(p.charAt(j-1)!='*') 
                    f[i][j] = f[i-1][j-1] && (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.');
                else
                    //the priority of && is higher than || 's
                    f[i][j] = f[i][j-2] || (p.charAt(j-2)=='.'||p.charAt(j-2)==s.charAt(i-1)) && f[i-1][j];
            }
        }
        return f[s.length()][p.length()];
    }
}