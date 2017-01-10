import java.util.*;
public class LetterCombinationsofaPhoneNumber{
	public static void main(String []args){
		List<String> list = letterCombinations("234");
		System.out.println(list);
	}
    public static List<String> letterCombinations(String digits) {
        char c[][] = {
        	{' '},
        	{},
        	{'a','b','c'},
        	{'d','e','f'},
        	{'g','h','i'},
        	{'j','k','l'},
        	{'m','n','o'},
        	{'p','q','r','s'},
        	{'t','u','v'},
        	{'w','x','y','z'}
        };
        List<String> list = new ArrayList<String>();
        if(digits.length()==0) return list;
        int digit[] = new int[digits.length()];
        for(int i=0;i<digit.length;i++)
        	digit[i] = (int)(digits.charAt(i)-'0');
        
        // System.out.println(Arrays.toString(digit));

        String []strs = new String[c[digit[0]].length];
        for(int i=0;i<strs.length;i++){
        	strs[i] = String.valueOf(c[digit[0]][i]);
        }

        for(int i=1;i<digit.length;i++){
        	strs = Combinations(strs,c[digit[i]]);
        }
        // System.out.println(Arrays.asList(strs));
        // System.out.println(Arrays.asList(result));
        return list=Arrays.asList(strs);
    }
    public static String[] Combinations(String strs[], char[] c){
    	String []result = new String[strs.length*c.length];
    	int k = 0;
    	for(int i=0;i<strs.length;i++){
    		for(int j=0;j<c.length;j++){
    			result[k++] = strs[i]+String.valueOf(c[j]);
    		}
    	}
    	return result;
    } 
}