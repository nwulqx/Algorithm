/*
	Show the right solution!
*/
public class GenerateParentheses{
    public List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<String>();
        String result = "(";
        help(list,result, n-1, n-1);
        return list;
    }
    public void help(List<String> list,String str,int n,int m){
    	if(n==0 && m==0){
    		list.add(str+")");
    		return;
    	}
    	if(n>0)
			help(list,str+"(", n-1, m);
		if(n<=m)
			help(list,str+")", n, m-1);
    }
}