#

Given a string, find the length of the longest substring without repeating characters.

**Examples:**

Given <font>`"abcabcbb"`</font>, the answer is <font>`"abc"`</font>, which the length is 3.

Given <font>`"bbbbb"`</font>, the answer is <font>`"b"`</font>, with the length of 1.

Given <font>`"pwwkew"`</font>, the answer is <font>`"wke"`</font>, with the length of 3. Note that the answer must be a substring, <font>`"pwke"`</font> is a *subsequence* and not a **substring**.

<style type="text/css">
font{
color:rgb(199,37,78)
}
</style>

##Brute Force

>没啥好说的，O(n)时间复杂，暴力遍历！