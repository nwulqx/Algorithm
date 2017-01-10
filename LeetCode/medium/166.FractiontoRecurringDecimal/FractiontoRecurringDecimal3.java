import java.util.*;
public class FractiontoRecurringDecimal3{
	public static void main(String []args){
		System.out.println(fractionToDecimal(-2147483648,1));
	}
    public static String fractionToDecimal(int numerator, int denominator) {
        int signal = 1;

        if((numerator>0 && denominator<0) || (numerator<0 && denominator>0)){
            signal = -1;
        }
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        System.out.println(Math.abs((long)-2147483648));
        long intPart = num/den;
        num %= den;
        StringBuffer sb = new StringBuffer();
        sb.append(intPart);
        if(num!=0){
            HashMap<Long,Integer> map = new HashMap<Long,Integer>();
            sb.append(".");
            while(num!=0){
                num *= 10;
                if(map.containsKey(num)){
                    sb.insert(map.get(num),"(");
                    sb.append(")");
                    break;
                }
                sb.append(num/den);
                map.put(num,sb.length()-1);
                num %= den;
            }
        }
        return signal>0?sb.toString():sb.insert(0,"-").toString();
    }
}