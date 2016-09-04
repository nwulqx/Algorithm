//brute force to solve the Longest Common SubString Problems
public class LongestCommonSubstring{
	public static void main(String []args){
		System.out.println(
			longestCommonSubstring("saabc","sacaab"));
		System.out.println(
			longestCommonSubstring2("saabc","sacaab"));
	}
/*error method ,ignore the m is variable	
public static String longestCommonSubstring2(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int longest=0,start=0;
		for(int i=0;i<len1;i++){
			int m=i,n=0,length=0;
			while(m<len1&&n<len2){
				//error
				if(str1.charAt(m)!=str2.charAt(n)){
					length = 0;
					n++;
					continue;	
				}else{
					length++;
					m++;n++;
					if(longest<length){
						longest = length;
						start = i;
					}
				}
			}
		}
		return str1.substring(start,start+longest);
	}*/
	public static String longestCommonSubstring(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int longest=0,start=0;
		for(int i=0;i<len1;i++){
			for(int j=0;j<len2;j++){
				int m=i,n=j,length=0;
				while(m<len1&&n<len2){
					if(str1.charAt(m)!=str2.charAt(n))
						break;
					length++;
					m++;
					n++;
					if(length>longest){
						longest = length;
						start = i;
					}
				}
			}
		}
		return str1.substring(start,start+longest);
	}
}