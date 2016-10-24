/*A clever method!*/
public class PowerofFour2{
	public static void main(String []args){
		System.out.println((63&0x55555555)==63);
	}
	/*because 101 0101 0101 0101 0101 0101 0101 0101 is power of 4 in every bit!*/
	public static boolean isPowerOfFour(int num) {
		return n>0 && (n&(n-1))==0 && (n&0b01010101010101010101010101010101)==n;
	}
}