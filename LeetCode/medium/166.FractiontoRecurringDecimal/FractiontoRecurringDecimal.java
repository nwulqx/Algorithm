import java.util.*;
// My Wrong answer! when 1/333 = "0.(0)",it is bad anser because of the digit loop judgement !
public class FractiontoRecurringDecimal{
	public static void main(String []args){
		System.out.println(fractionToDecimal(1,333));
	}
    public static String fractionToDecimal(int numerator, int denominator) {
        int intPart = numerator/denominator;
        numerator %= denominator;
        StringBuffer sb = new StringBuffer();
        sb.append(intPart);
        if(numerator==0)
        	return sb.toString();
        HashSet<Integer> set = new HashSet<Integer>();
        sb.append(".");

        while(numerator!=0){
        	numerator *= 10;
	        if(set.contains(numerator)){
	        	int index = sb.lastIndexOf(numerator / denominator+"");
	        	sb.insert(index,"(");
	        	sb.append(")");
	        	return sb.toString();
	        }
	        sb.append(numerator / denominator);
	        set.add(numerator);
			numerator %= denominator;
        }
        return sb.toString();
    }
}