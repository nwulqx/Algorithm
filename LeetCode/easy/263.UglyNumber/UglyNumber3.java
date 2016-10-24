/*beats:Second stair
Beacuse 4 is 2,so we can use for loop include 4.
*/
public class UglyNumber3{
	public static boolean isUgly(int num) {
        if(num<=0) return false;
		for(int i=2;i<6;i++){
			while(num%i==0)
				num /= i;
		}
		return num == 1;
	}
}