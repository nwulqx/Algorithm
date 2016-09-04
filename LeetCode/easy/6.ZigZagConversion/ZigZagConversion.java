public class ZigZagConversion{
	public static void main(String []args){
		System.out.print(convert("PAYPALISHIRING", 3));
	}
	 public static String convert(String s, int numRows) {
	 	String []str = s.split("");
	 	StringBuffer []sb = new StringBuffer[numRows];
	 	for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
	 	// StringBuffer sb = new StringBuffer();
 		int i = 0;
        while(i<str.length){
        	for(int j=0;j<numRows&&i<str.length;j++)
        		sb[j].append(str[i++]);
        	
        	for(int k=numRows-2;k>0&&i<str.length;k--)
        		sb[k].append(str[i++]);
        }
        for(int idx=1;idx<sb.length;idx++)
        	sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}