public class DivofTwoIntegers2{
	public static void main(String []args){
		getDiv(6,3);
	}
	public static int getDiv(int a,int b){
		int bitsNum = 0;
		while(a>=(b<<bitsNum))
			bitsNum++;

		int div = 0;
		for(int i=bitsNum;i>=0;i++){
			if((b<<bitsNum)>a) continue;
			div |= (1<<1);
		}
		return -1;
	}

}