# Count and Say

The count-and-say sequence is the sequence of integers beginning as follows:
<font>`1, 11, 21, 1211, 111221, ...`</font>

<font>`1`</font> is read off as <font>`"one 1"`</font> or <font>`11`</font>.<br>
<font>`11`</font> is read off as <font>`"two 1s"`</font> or <font>`21`</font>.<br>
<font>`21`</font> is read off as <font>`"one 2`</font>, then <font>`one 1"`</font> or <font>`1211`</font>.<br>
Given an integer n, generate the nth sequence.<br>

Note: The sequence of integers will be represented as a string.

<style type="text/css">
font{
color:rgb(199,37,78)
}
</style>

# Solution

>递归思想，要想知道3层，需要知道2层，需要知道1层，了解了按照递归的思路来实现即可！