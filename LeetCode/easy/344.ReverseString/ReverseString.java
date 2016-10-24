/*A simple method*/
public class ReverseString{
	public static void main(String []args){

	}
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
}