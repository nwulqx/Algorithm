public class ZigZagConversion2{
	public static void main(String []args){
		System.out.print(convert("", 1));
	}
	public static String convert(String s, int numRows){
		if(numRows==1) return s;
		String str[] = s.split("");
		int []index = new int[str.length];
		StringBuffer []sb = new StringBuffer[numRows];
		for(int idx = 0;idx<sb.length;idx++)
			sb[idx] = new StringBuffer();
		for(int i=0;i<str.length;i++){
			index[i] = i%(2*numRows-2);
			if(index[i]>(numRows-1))
				index[i] = (2*numRows-2)-index[i];
		}
		for(int i=0;i<str.length;i++)
			sb[index[i]].append(str[i]);
		for(int i=1;i<sb.length;i++)
			sb[0].append(sb[i]);
		return sb[0].toString();
	}
}