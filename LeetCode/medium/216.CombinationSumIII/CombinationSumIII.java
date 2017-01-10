public class CombinationSumIII{
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        help(res,list,k,n,1);
        return res;
    }
    public void help( List<List<Integer>> res, List<Integer> list, int k, int n,int start){
    	if(n<0 || k<0)
    		return;
    	if(k==0 && n==0)
    		res.add(list);
    	for(int i=start;i<10;i++){
    		List<Integer> tmp = new ArrayList<Integer>(list);
    		tmp.add(i);
    		help(res,tmp,k-1,n-i,i+1);
    	}
    }
}