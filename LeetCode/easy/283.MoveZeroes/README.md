# 283. Move Zeroes
Given an array `nums`, write a function to move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

For example, given `nums = [0, 1, 0, 3, 12]`, after calling your function, `nums` should be `[1, 3, 12, 0, 0]`.

Note:

1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.

# Solution

1. 巧妙地利用一个索引，如果为数组0，则索引不增加；
2. 如果，数组不为0，则索引处存储数组遍历值，索引++。

    	int length = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=0) nums[length++] = nums[i];
    	}