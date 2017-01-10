/*My solution! Need to optimized!
*/
public class AddBinary{
    public String addBinary(String a, String b) {
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        int size1 = c1.length-1;
        int size2 = c2.length-1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        while(size1>=0&&size2>=0){
        	if(c1[size1] == '1' && c2[size2] == '1'){
        		if(carry == 1){
        			sb.insert(0,1);
        		}else{
        			carry = 1;
        			sb.insert(0,0);
        		}
        	}else if(c1[size1] == '1' || c2[size2] == '1'){
        		if(carry == 1){
        			sb.insert(0,0);
        		}else{
        			sb.insert(0,1);
        		}
        	}else if(c1[size1] == '0' && c2[size2] == '0'){
        		if(carry == 1){
        			carry = 0;
        			sb.insert(0,1);
        		}else{
        			sb.insert(0,0);
        		}
        	}
        	size1--;
        	size2--;
        }
        while(size1>=0){
        	if(carry==1){
        		if(c1[size1] == '1'){
        			sb.insert(0,0);
        		}else{
        			carry = 0;
        			sb.insert(0,1);
        		}
        	}else{
        		sb.insert(0,c1[size1]);
        	}
        	size1--;
        }
        while(size2>=0){
        	if(carry==1){
        		if(c2[size2] == '1'){
        			sb.insert(0,0);
        		}else{
        			carry = 0;
        			sb.insert(0,1);
        		}
        	}else{
        		sb.insert(0,c2[size2]);
        	}
        	size2--;
        }
        if(carry==1) sb.insert(0,1);
        return sb.toString();
    }
}