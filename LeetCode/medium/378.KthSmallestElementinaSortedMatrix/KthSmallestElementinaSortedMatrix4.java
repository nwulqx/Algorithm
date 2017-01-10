public class KthSmallestElementinaSortedMatrix4{
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
		int n = matrix.length;
		pq.offer(new Tuple(0,0,matrix[0][0]));
		for(int i=0;i<k-1;i++){
			Tuple t = pq.poll();
			if(t.x!=n-1)
				pq.offer(new Tuple(t.x+1,t.y,matrix[t.x+1][t.y]));
			if(t.y!=n-1)
				pq.offer(new Tuple(t.x,t.y+1,matrix[t.x][t.y+1]));
		}
		return pq.poll().val;
	}
}
class Tuple implements Comparable<Tuple>{
	public int x = 0;
	public int y = 0;
	public int val = 0;

	public Tuple(int i,int j,int val){
		this.x = i;
		this.y = j;
		this.val = val;
	}
	public int compareTo(Tuple t){
		return this.val-t.val;
	}
}