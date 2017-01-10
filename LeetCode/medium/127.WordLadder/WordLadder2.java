import java.util.*;
// Using BFS,it beats:80%;
public class WordLadder2{
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
		Set<String> beginSet = new HashSet<String>(),
		endSet = new HashSet<String>(),
		visited = new HashSet<String>();
		beginSet.add(beginWord);
		endSet.add(endWord);
		while(!beginSet.isEmpty() && !endSet.isEmpty()){
			Set<String> temp = new HashSet<String>();
			for(String word : beginSet){
				char []chs = word.toCharArray();
				for(int i=0;i<chs.length;i++){
					char old = chs[i];
					for(char c='a';c<='z';c++){
						chs[i] = c;
						String target = String.valueOf(chs);
						if(endSet.contains(target))
							return len+1;
						if(!visited.contains(target) && wordList.contains(target)){
							temp.add(target);
							visited.add(target);
						}
					}
					chs[i] = old;
				}
			}
			beginSet = temp;
			len++;
		}
		return 0;
	}
}