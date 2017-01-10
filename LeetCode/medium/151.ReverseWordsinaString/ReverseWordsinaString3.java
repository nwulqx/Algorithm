// Wrong answer ,but the the thinking of this problem is good;
// two reverse will get the reverse string.
public class ReverseWordsinaString3{
    public static void main(String []args){
        ReverseWordsinaString3 rs = new ReverseWordsinaString3();
        System.out.println(rs.reverseWords("  the sky is blue     "));
    }
    public String reverseWords(String s) {
        s = s.trim();
        char c[] = s.toCharArray();
        this.help(c,0,c.length-1);
        int begin = 0;
        int end = 0;
        for(int i=0;i<=c.length;i++){
            if(i == c.length || c[i] == ' '){
                end = i-1;
                this.help(c,begin,end);
                begin = i+1;
            }
        }
        return new String(c);
    }
    public void help(char []c,int i,int j){
        while(i < j){
            c[i] = (char)(c[i] ^ c[j]);
            c[j] = (char)(c[i] ^ c[j]);
            c[i] = (char)(c[i] ^ c[j]);
            i++;
            j--;
        }
    }
}