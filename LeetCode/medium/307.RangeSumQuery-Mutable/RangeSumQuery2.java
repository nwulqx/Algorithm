public class RangeSumQuery2{
	public static void main(String []args){
		int []nums = {1,2,3,4,5,6};
		RangeSumQuery2 numarray = new RangeSumQuery2(nums);
        numarray.update(2,0);
		System.out.println(root.sum);
        System.out.println(numarray.sumRange(1,3));
	}
	class SegmentTree{
		int start, end, sum;
		SegmentTree left, right;
		public SegmentTree(int start, int end){
			this.start = start;
			this.end = end;
			this.left = null;
			this.right = null;
		}
	}
	public static SegmentTree root;
	private SegmentTree buildTree(int[] nums, int start, int end){
		if(start > end)
			return null;
		else{
			SegmentTree st = new SegmentTree(start,end);
			if(start == end)
				st.sum = nums[start];
			else if(start < end){
				int mid = start + (end - start)/2;
				st.left = buildTree(nums,start,mid);
				st.right = buildTree(nums,mid+1,end);
				st.sum = st.left.sum + st.right.sum;
			}
			return st;
		}
	}
	public RangeSumQuery2(int[] nums){
		root = buildTree(nums,0,nums.length-1);
	}
	private void updateTree(SegmentTree st, int pos, int val){
		if(st.start == pos && st.end == pos)
			st.sum = val;
		else{	
			int mid = st.start +  (st.end - st.start)/2;
			if(pos <= mid)
				updateTree(st.left,pos,val);
			else if(pos > mid)
				updateTree(st.right,pos,val);
			st.sum = st.left.sum + st.right.sum;
		}
	}
	public void update(int i, int val){
		updateTree(root,i,val);
	}
	private int sumTreeRange(SegmentTree st, int start, int end){
		if(st.start == start && st.end == end)
			return st.sum;
		else{
			int mid = st.start +  (st.end - st.start)/2;
			if(end <= mid)
				return sumTreeRange(st.left,start,end);
			else if(start > mid)
				return sumTreeRange(st.right,start,end);
			return sumTreeRange(st,start,mid) + sumTreeRange(st,mid+1,end);
		}
	}
	public int sumRange(int i, int j){
		return sumTreeRange(root,i,j);
	}
}