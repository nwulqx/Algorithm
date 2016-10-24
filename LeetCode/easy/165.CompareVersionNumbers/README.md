# 165. Compare Version Numbers

Compare two version numbers version1 and version2.<br>
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.<br>

You may assume that the version strings are non-empty and contain only digits and the `.` character.<br>
The `.` character does not represent a decimal point and is used to separate number sequences.<br>
For instance, `2.5` is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.<br>

Here is an example of version numbers ordering:

	0.1 < 1.1 < 1.2 < 13.37

# Solution

注意边界检测：

	1.1 = 1.1.0 = 1.1.0.0

这个问题需要测试清楚。那么这个问题可以使用正则表达式切个数组，但是有一点需要注意，正则匹配特殊符号需要转译。例如，匹配字符`.`需要使用双反斜杠`\\.`来进行转译。

循环比较，如果超过某一个字符数组长度，那么应该用 `0` 作默认值。

