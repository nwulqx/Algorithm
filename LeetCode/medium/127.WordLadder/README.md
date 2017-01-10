# 127. Word Ladder

Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the word list
For example,

Given:<br>
beginWord = `"hit"`<br>
endWord = `"cog"`<br>
wordList = `["hot","dot","dog","lot","log"]`<br>
As one shortest transformation is `"hit" -> "hot" -> "dot" -> "dog" -> "cog"`,<br>
return its length `5`.

**Note:**<br>

- Return 0 if there is no such transformation sequence.
- All words have the same length.
- All words contain only lowercase alphabetic characters.

# Solution

## BFS广度优先遍历

```java
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
		visted = new HashSet<String>();
		beginSet.add(beginWord);
		endSet.add(endWord);
		while(!beginSet.isEmpty() && !endSet.isEmpty()){
			Set<String> temp = new HashSet<String>();
			for(String word : beginSet){
				char chs[] = word.toCharArray();
				for(int i=0;i<chs.length;i++){
					char old = chs[i];
					for(char c='a';c<='z';c++){
						chs[i] = c;
						String target = String.valueOf(chs);
						if(endSet.contains(target))
							return len+1;
						if(!visted.contains(target) && wordList.contains(target)){
							temp.add(target);
							visted.add(target);
						}
					}
					chs[i] = old;
				}
			}
			len++;
			beginSet = temp;
		}
		return 0;
	}
}
```

## 分析

>1. 将开始的字符串和结束的字符串分别放进一个集合中；
>2. 从开始字符串集合中查找，每次取出一个字符串，对每一个字符进行变更，同时进行广度优先遍历；
>3. 如果存在一个变换了一个字符的字符串，存在于结果字符串集合中，那么就得到了变化路径；
>4. 如果步骤3为否定，则对于每次变换一个字符并且存在于字典中的字符串，进行保存，并对这些保存的字符串再次展开BFS，则进行步骤2。

## Optimize

>做到以上，已经用BFS解决了。但是，还有地方需要优化。

### 交换开始和结束集合

>总是在开始和结束集合中选择小的集合作为开始集合。<br>
>因为，不论从前还是从后进行广度优先遍历，只要查询的目标在另一个集合中，则说明已存在通过的路径。

```java
import java.util.*;
// Using BFS,it beats:80%;
public class WordLadder2{
	public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		int len = 1;
		Set<String> beginSet = new HashSet<String>(),
		endSet = new HashSet<String>(),
		visted = new HashSet<String>();
		beginSet.add(beginWord);
		endSet.add(endWord);
		while(!beginSet.isEmpty() && !endSet.isEmpty()){
			// Optimized
			if(beginSet.size() > endSet.size()){
				Set<String> set = beginSet;
				beginSet = endSet;
				endSet = set;
			}
			Set<String> temp = new HashSet<String>();
			for(String word : beginSet){
				char chs[] = word.toCharArray();
				for(int i=0;i<chs.length;i++){
					char old = chs[i];
					for(char c='a';c<='z';c++){
						chs[i] = c;
						String target = String.valueOf(chs);
						if(endSet.contains(target))
							return len+1;
						if(!visted.contains(target) && wordList.contains(target)){
							temp.add(target);
							visted.add(target);
						}
					}
					chs[i] = old;
				}
			}
			len++;
			beginSet = temp;
		}
		return 0;
	}
}
```

