/*
Using while loop Beats 55%  !!!
*/
public class PascalsTriangleII2{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        while(rowIndex!=-1){
        	list = getRow(list);
    		rowIndex--;
        }
        return list;
    }
    public List<Integer> getRow(List<Integer> list){
    	list.add(0,1);
    	for(int i=1;i<list.size()-1;i++){
    		list.set(i,list.get(i)+list.get(i+1));
    	}
    	return list;
    }
}