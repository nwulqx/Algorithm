public class CombinationSumII{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList();
        List<Integer> list =  new ArrayList();
        help(res,list,candidates,target,0);
        return res;
    }
    public void help(List<List<Integer>> res, List<Integer> list, int[] candidates, int target , int start){
    	if(target<0)
    		return;
    	if(target==0)
    		res.add(list);
    	for(int i=start;i<candidates.length;i++){
    		// There is i>start
    		if(i>start && candidates[i] == candidates[i-1])
    			continue;
    		List<Integer> tmp = new ArrayList(list);
    		tmp.add(candidates[i]);
    		help(res,tmp,candidates,target-candidates[i],i+1);
    	}
    }
}