/*Using PriorityQueue and column++;
*/
public class KthSmallestElementinaSortedMatrix2{
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
		int n = matrix.length;
		for(int i=0;i<n;i++){
			pq.offer(new Tuple(0,i,matrix[0][i]));
		}
		for(int i=0;i<k-1;i++){
			Tuple t = pq.poll();
			if(t.x==n-1)
			    continue;
			pq.offer(new Tuple(t.x+1,t.y,matrix[t.x+1][t.y]));
		}
		return pq.poll().val;
	}
}
class Tuple implements Comparable<Tuple>{
	public int x = 0;
	public int y = 0;
	public int val = 0;

	public Tuple(int i,int j,int val){
		this.i = i;
		this.j = j;
		this.val = val;
	}
	public int compareTo(Tuple t){
		return this.val-t.val;
	}
}