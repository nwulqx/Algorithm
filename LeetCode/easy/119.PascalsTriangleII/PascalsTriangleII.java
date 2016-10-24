/*Recursion!
Beats:16.07%;
*/
public class PascalsTriangleII{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex==-1) return list;
        list = getRow(rowIndex-1);
        return this.getRow(list);
    }
    public List<Integer> getRow(List<Integer> list){
    	list.add(0,1);
    	for(int i=1;i<list.size()-1;i++){
    		list.set(i,list.get(i)+list.get(i+1));
    	}
    	return list;
    }
}
