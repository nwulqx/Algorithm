public class AddDigits2{
	public static void main(String []args){

	}
    public static int addDigits(int num) {
        if(num==0) return 0;
        int temp = num%9;
    	if(temp==0) return 9;
    	return temp;
    }
}