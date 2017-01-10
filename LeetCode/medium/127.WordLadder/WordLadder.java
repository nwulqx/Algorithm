import java.util.*;
public class WordLadder{
	public static void main(String []args){
		Set<String> set = new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		System.out.println(ladderLength(new String("hit"),new String("cog"),set));
	}
    public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        int len = 1;
        Set<String> beginSet = new HashSet<String>(),endSet = new HashSet<String>();
        Set<String> visted = new HashSet<String>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size()>endSet.size()){
                Set<String> tmp = beginSet;
                beginSet = endSet;
                endSet = tmp;
            }
        	Set<String> temp = new HashSet<String>();
        	for(String word : beginSet){
        		char []chs = word.toCharArray();
        		for(int i=0;i<chs.length;i++){
        			for(char c='a';c<='z';c++){
        				char old = chs[i];
        				chs[i] = c;
        				String target = String.valueOf(chs);
        				if(endSet.contains(target)){
        					return len+1;
        				}
        				if(!visted.contains(target) && wordList.contains(target)){
        					temp.add(target);
        					visted.add(target);
        				}
        				chs[i] = old;
        			}
        		}
        	}
        	beginSet = temp;
        	len++;
        }
        return 0;
    }
}