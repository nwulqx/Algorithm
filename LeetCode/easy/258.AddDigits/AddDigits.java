public class AddDigits{
	public static void main(String []args){
		System.out.println(addDigits(38));
	}
    public static int addDigits(int num) {
    	if(num<10) return num;
    	int sum = 0;
        while(num>0){
        	int bit = num % 10;
        	sum += bit;
        	num /= 10;
        }
        return addDigits(sum);
    }
}