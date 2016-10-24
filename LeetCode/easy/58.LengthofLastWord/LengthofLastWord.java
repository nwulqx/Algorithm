/*How to optimize it ?
*/
public class LengthofLastWord{
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        return str.length==0?0:str[str.length-1].length();
    }
}