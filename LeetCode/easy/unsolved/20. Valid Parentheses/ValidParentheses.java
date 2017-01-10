import java.util.*;
public class ValidParentheses{
	public static void main(String []args){
		System.out.println(isValid("()}{"));
	}
	public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        if(s.charAt(0)=='}' || s.charAt(0)==']' || s.charAt(0)==')' ) return false;
        boolean result = false;
        char c[] = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<c.length;i++){
        	if(c[i]=='('|| c[i]=='{' || c[i]=='[')
        		stack.push(c[i]);
        	else{
        		if(stack.empty()){
        			result = false;
        			break;
        		}else{
        			char temp = stack.pop();
	        		if((temp == '{' && c[i] == '}') || (temp == '[' && c[i] == ']') || (temp == '(' && c[i] == ')'))
	        			result = true;
	        		else{
	        			result = false;
	        			break;
	    			}
        		}
        	}
        }
        return result;
    }
}