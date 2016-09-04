#RegularExpressionMatching

Implement regular expression matching with support for  <font color='rgb(199,37,78)'>' . '</font> and <font color='rgb(199,37,78)'> ' * '</font>.

	'.' Matches any single character.
	'*' Matches zero or more of the preceding element.
	
	The matching should cover the entire input string (not partial).
	
	The function prototype should be:
	bool isMatch(const char *s, const char *p)
	
	Some examples:
	isMatch("aa","a") → false
	isMatch("aa","aa") → true
	isMatch("aaa","aa") → false
	isMatch("aa", "a*") → true
	isMatch("aa", ".*") → true
	isMatch("ab", ".*") → true
	isMatch("aab", "c*a*b") → true

#解决：

<a href="https://zh.wikipedia.org/wiki/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92">DP问题</a>：（Dynamic Programming）动态规划，引申<a href="https://zh.wikipedia.org/wiki/NP_(%E8%A4%87%E9%9B%9C%E5%BA%A6)">NP问题</a>

Youtuebe has a lot of videos to explain this problems!