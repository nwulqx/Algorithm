/*The rules : C[k,i] = C[k,i-1]*(k-i+1)/i
wiki:https://en.wikipedia.org/wiki/Pascal%27s_triangle#Calculating_a_row_or_diagonal_by_itself
Very good method!
*/
public class PascalsTriangleII{
	public List<Integer> getRow(int rowIndex) {
		Integer []rowarray = new Integer[rowIndex+1];
		rowarray[0] = 1;
		for(int i=1;i<rowarray.length;i++){
			rowarray[i] = (int)((long)rowarray[i-1]*(rowIndex+1-i)/(i));
		}
		return Arrays.asList(rowarray);
	}
}