# 349. Intersection of Two Arrays

Given two arrays, write a function to compute their intersection.

**Example:**

Given nums1 = `[1, 2, 2, 1]`, nums2 = `[2, 2]`, return `[2]`.

**Note:**

- Each element in the result must be unique.
- The result can be in any order.

# Solution

## 我的思路：
双层循环，时间复杂度O(m*n)。（5%）

##优化方法

使用Set集合，使得他的时间复杂度降为O(m+n)。（21%）

##更好的方法

###可以联想到双指针法

1. 对数组排序，双索引分别遍历两个数组。
2. 比较两个索引处值得大小，并依此来移动索引。
3. 如果相等则存到Set集合。
3. 直到其中一个索引指到结尾结束。（78%）

###问题：
发现

	if(boolean){
		exception;
	}
的效率高于

	if(boolean)
		exception;

###实验：

		int j = 0;
		long t1=System.currentTimeMillis();
		for(int i=0;i<100000000;i++)
			if(true)
				j++;
		long t2=System.currentTimeMillis();
		System.out.println(t2-t1);
		j = 0;
		long t3=System.currentTimeMillis();
		for(int i=0;i<100000000;i++){
			if(true){
				j++;
			}
		}
		long t4=System.currentTimeMillis();
		System.out.println(t4-t3);

多次测试：
