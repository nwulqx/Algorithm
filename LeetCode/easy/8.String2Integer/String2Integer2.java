public class String2Integer2{
    public static void main(String []args){
        System.out.println(myAtoi(new String("+-1")));
    }
    public static int myAtoi(String str) {
        char []c = str.toCharArray();
        int start = 0;
        while(start<c.length){
            if(c[start] == ' ')
                start ++;
            else
                break;
        }
        int end = start;
        while(end<c.length){
            if((c[end]=='+' || c[end]=='-') && (end<c.length-1&&(c[end+1]>='0' && c[end+1]<='9')))
                end ++;
            if(c[end]>='0' && c[end]<='9')
                end++;
            else
                break;
        }
        String target = str.substring(start,end);
        if(target.length()==0)
            return 0;
        try{
            long result = Long.parseLong(target);
            if(result<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(result>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return (int)result;
        }catch(Exception e){
            if(str.charAt(0)=='-')
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }
}