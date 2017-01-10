public class CombinationSum{
	List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list = new ArrayList();
        List<Integer> res = new ArrayList<Integer>();
        help(candidates,target,res,0);
        return list;
    }
    public void help(int[] candidates, int target, List<Integer> res,int start){
    	if(target==0){
    		list.add(res);
    		return;
    	}
    	if(target>0){
    		for(int i=start;i<Math.ceil((candidates.length+1)/2);i++){
    			List<Integer> res2 = new ArrayList(res);
    			res2.add(candidates[i]);
    			help(candidates,target-candidates[i],res2,i);
    		}
    	}
    }
}