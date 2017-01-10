#Longest Common Prefix（最长相同前缀）

Write a function to find the longest common prefix string amongst an array of strings.

##解决：
>这个题很巧妙的利用了从尾部遍历数组的技巧。<br>
>如果正向遍历，那么需要知道每一个字串是否都存在于每一个字符串，如果存在，则在向后加一个字符，在比较。那么需要的时间复杂度为Min(str[i].length)*str.length。

### Optimized

可以使用倒叙遍历来优化方法（最长子串索引倒叙遍历），倒叙的好处，如果所有的字符串均能满足相等，那么这个索引就是最长的字串索引。
如果不满足，则可以降低最长子串索引，来和第一个字串来比较。时间复杂度：O(n+str[0].length)。

## Boundary Check

1. 字符串数组为0或者第一个字符串为0，应该返回空。