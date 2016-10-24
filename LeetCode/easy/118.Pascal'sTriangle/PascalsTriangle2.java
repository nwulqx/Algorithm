/*
beats:50% up!
*/
public class PascalsTriangle2{
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++){
			list.add(0,1);
			for(int j=1;j<list.size()-1;j++){
				list.set(j,list.get(j)+list.get(j+1));
			}
			/*
				result only save the address,not the data.So return [[1,4,6,4,1],[1,4,6,4,1],[1,4,6,4,1],[1,4,6,4,1],[1,4,6,4,1]]
				result.add(list);
			*/
			result.add(new ArrayList<Integer>(list));
		}
		return result;
	}
}