public class NumArray{
	public static void main(String []args){
		int []nums = {1,2,3,4,5,6};
		NumArray numarray = new NumArray(nums);
        numarray.update(2,0);
		System.out.println(root.sum);
        System.out.println(numarray.sumRange(1,3));
	}
	private static SegemntTree root;
	class SegemntTree{
		int start,end,sum;
		SegemntTree left,right;
		public SegemntTree(int start ,int end){
			this.start = start;
			this.end = end;
			this.left = null;
			this.right = null;
		}
	}
    public NumArray(int[] nums) {
    	root = this.buildTree(nums,0,nums.length-1);
    }
    private SegemntTree buildTree(int []nums,int start,int end){
    	if(start > end)
    		return null;
    	else{
    		SegemntTree st = new SegemntTree(start,end);
            if(start == end)
                st.sum = nums[start];
            else{
                int mid = start + (end-start)/2;
                st.left = buildTree(nums,start,mid);
                st.right = buildTree(nums,mid+1,end);
                st.sum = st.left.sum + st.right.sum;
            }
            return st;
    	}
    }
    //updat element
    void update(int i, int val) {
        this.updateTree(root,i,val);
    }
    private void updateTree(SegemntTree root , int i, int val){
        if(root.start == i && root.end == i)
            root.sum = val;
        else{
            int mid = root.start + (root.end - root.start)/2;
            if(i <= mid)
                updateTree(root.left,i,val);
            else
                updateTree(root.right,i,val);
            root.sum = root.left.sum + root.right.sum;
        }
    }

    //caculate sum of a area
    public int sumRange(int i, int j) {
        return sumTree(root,i,j);
    }
    private int sumTree(SegemntTree root , int i, int j){
        if(root.start == i && root.end == j)
            return root.sum;
        else{
            int mid = root.start + (root.end - root.start)/2;
            if(i >= mid+1)
                return sumTree(root.right,i,j);
            else if(j <= mid)
                return sumTree(root.left,i,j);
            else
                return sumTree(root.left,i,mid) + sumTree(root.right,mid+1,j);
        }
    }
}