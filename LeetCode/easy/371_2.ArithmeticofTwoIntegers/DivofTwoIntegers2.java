public class DivofTwoIntegers2{
	public static void main(String []args){
		System.out.println(getDiv(12,3));
	}
	public static int getDiv(int a,int b){
		int bitsNum = 0;
		while(a>=(b<<bitsNum))
			bitsNum++;
		
		int div = 0;
		for(int i=bitsNum;i>=0;i--){
			if((b<<i)>a){
				div <<= 1;
				continue;
			}
			// div |= (1<<1);
			a -= (b<<i);
			div = (div<<1)+1;
		}
		return div;
	}

}