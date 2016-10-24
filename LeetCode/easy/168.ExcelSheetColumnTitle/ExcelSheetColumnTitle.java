public class ExcelSheetColumnTitle{
	public static void main(String []args){
		System.out.println(convertToTitle(52));
	}
    public static String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
     	if(n==0) return "";
        while(n!=0){
			sb.append((char)(65+(n-1)%26));
			n = (n-1)/26;
    	}
        return sb.reverse().toString();
    }
}