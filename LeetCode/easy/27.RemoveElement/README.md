# RemoveElement

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = <font color='rgb(199,37,78)'>`[3,2,2,3]`</font>, val = <font color='rgb(199,37,78)'>`3`</font>

Your function should return length = 2, with the first two elements of nums being 2.

## solution
>利用了和RemoveDuplicatesfromSortedArray相同的思想<br>
>利用length既可以该值既可以表示索引，也可以表示索引长度，将比较重复的逻辑换成比较数组元素和val即可！

