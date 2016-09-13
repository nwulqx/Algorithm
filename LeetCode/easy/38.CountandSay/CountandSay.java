/*recursion and for loop*/
public class CountandSay{
	public static void main(String []args){
		// count("11122111212312");
		String s = countAndSay(5);
		System.out.println(s);
	}
    public static String countAndSay(int n) {
    	if(n == 1) return "1";
        String str = countAndSay(n-1);
        StringBuffer sb = new StringBuffer();
        int length = 1;
        for(int i=1;i<str.length()+1;i++){
        	if(i==str.length() || str.charAt(i)!=str.charAt(i-1)){
        		sb.append(length).append(str.charAt(i-1));
        		length = 1;
        	}
        	else
        		length++;
        }
        return sb.toString();
    }
    /*This method solve the joint string
    */
	public static void count(String str){
		StringBuffer sb = new StringBuffer();
		int length = 1;
		for(int i=1;i<str.length()+1;i++){
        	if(i==str.length() || str.charAt(i)!=str.charAt(i-1)){
        		sb.append(length).append(str.charAt(i-1));
        		length = 1;
        	}
        	else
        		length++;
        }
        System.out.println(sb.toString());
	}
}