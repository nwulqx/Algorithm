public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*'){
                List<Integer> leftList = diffWaysToCompute(input.substring(0,i));
                List<Integer> rightList = diffWaysToCompute(input.substring(i+1));
                for(int p1:leftList){
                    for(int p2: rightList){
                        Integer c = 0;
                        switch(input.charAt(i)){
                            case '+':
                                c = p1+p2;
                                break;
                            case '-':
                                c = p1-p2;
                                break;
                            case '*':
                                c = p1*p2;
                                break;
                        }
                        res.add(c);
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.parseInt(input));
        }
        return res;
    }
}