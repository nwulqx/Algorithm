#LongestCommonSubstring

Write a function to find the longest common substring amongst two strings.

##解决：

>DP问题，当前字串满足最长子串的前提是字串(n-1)满足最长子串&&当前字符相等。<br>
>   动态转移方程为：

   	如果xi == yj， 则 c[i][j] = c[i-1][j-1]+1

   	如果xi ! = yj,  那么c[i][j] = 0