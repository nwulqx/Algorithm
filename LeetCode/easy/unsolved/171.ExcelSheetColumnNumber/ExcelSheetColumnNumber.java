public class ExcelSheetColumnNumber{
	public static void main(String []args){
		// System.out.println(power(10,1));
		System.out.println(titleToNumber("YY"));
	}

    public static int titleToNumber(String s) {
        char c[] = s.toCharArray();
        int sum = 0;
        for(int i=c.length-1;i>=0;i--){
        	sum += (c[i]-64)*power(26,c.length-1-i);
        }
        return sum;
    }
	public static int power(int nums,int power){
		if(power == 0) return 1;
		if(power == 1) return nums;
		if(power == 2) return nums*nums;
		return nums*power(nums,power-1);
	}
}