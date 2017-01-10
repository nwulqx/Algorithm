public class String2Integer {
    public int myAtoi(String str) {
        if(str.length()==0) return 0;
        char []c = str.toCharArray();
        int len = 0;
        int lo = 0;
        for(int i=0;i<c.length;i++){
            if((c[i]==' ')/*||(i<c.length-1&&(c[i]==45||c[i]==43)&&(c[i+1]==45||c[i+1]==43))*/) lo++;
            else break;
        }
        for(int i=lo;i<c.length;i++){
            // The ascii 45 is negative sign('-'),the ascii 43 is positive sign '+'
            if((c[i]==45||c[i]==43)&&(i<c.length-1&&(c[i+1]>47&&c[i+1]<58))) len++;
            // else if(len>1&&(c[i]==45||c[i]==43)) break;
            else if((c[i]>47&&c[i]<58)) len++;
            else break;
        }
        // if(len==0) return 0;
        String tmp = new String(c,lo,len);
        if(tmp.length()==0) return 0;
        try{
    		long result = Long.parseLong(tmp);
            if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else return (int)result;
    	}catch(NumberFormatException e){
            System.out.println("Try catch");
    		 if(tmp.charAt(0)==45) return Integer.MIN_VALUE;
             else return Integer.MAX_VALUE;
    	}
    }
}