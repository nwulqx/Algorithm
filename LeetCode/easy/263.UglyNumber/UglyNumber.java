/*Using recursion will cause stackoverflow!*/
public class UglyNumber{
    public static boolean isUgly(int num) {
        if(num == 2 || num ==3 || num == 5) return true;
        if(num % 2 == 0){
        	return isUgly(num/2);
        }else if(num % 3 == 0){
        	return isUgly(num/3);
        }else if(num % 5 == 0){
        	return isUgly(num/5);
        }
        return false;
    }
}