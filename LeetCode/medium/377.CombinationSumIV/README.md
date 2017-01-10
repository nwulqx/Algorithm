# 377. Combination Sum IV

Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

Example:

	nums = [1, 2, 3]
	target = 4

	The possible combination ways are:
	(1, 1, 1, 1)
	(1, 1, 2)
	(1, 2, 1)
	(1, 3)
	(2, 1, 1)
	(2, 2)
	(3, 1)

	Note that different sequences are counted as different combinations.

	Therefore the output is 7.

Follow up:
What if negative numbers are allowed in the given array?
How does it change the problem?
What limitation we need to add to the question to allow negative numbers?

# Solution

## 使用递归的方法：

	public class CombinationSumIV{
	    public int combinationSum4(int[] nums, int target) {
	        if(target==0)
	        	return 1;
	        int i = 0;
	        for(int j=0;j<nums.length;j++){
	        	if((target-nums[j])>=0){
	        		i += combinationSum4(nums,target-nums[j]);
	        	}
	        }
	        return i;
	    }
	}

这个其实挺难理解的，变量i的作用是累加计算：即所有情况-->通过nums数组元素抵达target值的次数。

例如：nums[] = [1,2],target = 3;

那么计算4：首先需要知道f(3-1)+f(3-2)
然后继续递归计算：

>对于f(3-1)-->f(2-1)+f(2-2) == f(2) = f(1)+f(0);

>对于f(3-2)-->f(1-1)+f(1-2) == f(1)=f(0)+f(-1);

我们只需要求出f(2)+f(1);的结果即可。

### 问题；

上面的解法虽然使用了递归下的DP解法，但是涉及了一个优化问题。

对于f(2) = f(1)+f(0);我们已经知道了f(0)和f(1)的值，但是在f(1)=f(0)+f(-1);我们有计算了一遍。两次结果应该是一致的，因为都是遍历nums数组来求目标target组成的次数。

## Optimized

使用一个数组来存储每一次求的结果，这样，可以通过已得到的结果快速得到答案！