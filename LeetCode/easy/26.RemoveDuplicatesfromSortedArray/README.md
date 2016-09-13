#RemoveDuplicatesfromSortedArray

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = <font color='rgb(199,37,78)'>`[1,1,2]`</font>,

Your function should return length = <font color='rgb(199,37,78)'>`2`</font>, with the first two elements of nums being <font color='rgb(199,37,78)'>`1`</font> and <font color='rgb(199,37,78)'>`2`</font> respectively. It doesn't matter what you leave beyond the new length.

##solution

>去除重复元素，并返回数组长度。<br/>
>我的解决办法并不是真正的删除重复元素，因为那么做浪费了空间，需要重新再定义一个数组。<br/>
>设置一个长度length（该值既可以表示索引，也可以表示索引长度），遍历数组，当数组相邻元素重复时，将当前索引处的值赋给length为索引处，同时length++；<br>
>遍历完成后，返回length

        int length = 0;
        for(int i=0;i<nums.length;i++){
        	if(i>0 && nums[i] == nums[i-1])
        		continue;
        	nums[length] = nums[i];
        	length++;
        }
        return length;