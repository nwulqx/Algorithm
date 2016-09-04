// Dynamic Programming to solve the Longest Commen SubString problems
public class LongestCommonSubstring2{
	public static void main(String []args){
		System.out.println(
			longestCommonSubstring2("dsabcdef","sadabcef"));
	}
	public static String longestCommonSubstring2(String str1,String str2){
		int [][]f = new int[str1.length()+1][str2.length()+1];
		int maxlength = 0,maxi = 0,maxj = 0;
		f[0][0] = 0;
		//set f[0][i] = 0;
		for(int i=1;i<f[0].length;i++)
			f[0][i] = 0;
		//set f[i][0] = 0;
		for(int i=1;i<str1.length()+1;i++)
			f[i][0] = 0;
		for(int i=1;i<str1.length()+1;i++){
			for(int j = 1;j<f[0].length;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)) 
					f[i][j] = f[i-1][j-1]+1;
				else
					f[i][j] = 0;
				if(f[i][j]>maxlength){
					maxlength = f[i][j];
					maxi = i;
					maxj = j;
				}
			}
		} 
		return str1.substring(maxi-maxlength,maxi);
	}
}