/*
An inefficient method !
beats:2.48%
*/
public class PascalsTriangle{
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(numRows==0) return result;
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
		result.add(list);
        while(numRows>1){
        	list = generate(list);
        	result.add(list);
        	numRows--;
        }
        return result;
    }
    public static List<Integer> generate(List<Integer> list){
    	List<Integer> result = new ArrayList<Integer>();
    	for(int i=0;i<list.size();i++){
    		if(i>0){
    			result.add(list.get(i-1)+list.get(i));
    		}else{
    			result.add(list.get(i));
    		}
    	}
    	result.add(1);
    	return result;
    }
}