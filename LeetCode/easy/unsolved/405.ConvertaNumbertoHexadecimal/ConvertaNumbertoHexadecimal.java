public class ConvertaNumbertoHexadecimal{
	public static void main(String []args){
		System.out.println(toHex(-1));
	}
	public static String toHex(int num) {
		if(num==0) return "0";
		StringBuffer sb = new StringBuffer();
		while(num!=0){
			int hexBit = num&15;
			if(hexBit>9){
				sb.append((char)(97+hexBit-10));
			}else{
				sb.append(hexBit);
			}
			num >>>= 4;
		}
		return sb.reverse().toString();
    }
}