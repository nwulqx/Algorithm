# 350. Intersection of Two Arrays II

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = `[1, 2, 2, 1]`, nums2 = `[2, 2]`, return `[2, 2]`.

**Note:**

- Each element in the result should appear as many times as it shows in both arrays.
- The result can be in any order.
**Follow up:**

- What if the given array is already sorted? How would you optimize your algorithm?
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

# Solution

>1. Set集合决定了你可以存储相同的元素还是不同的元素。<br>
>2. 如果存储相同的元素，可以使用List集合。<br>
>3. 使用排序+双指针循环还是使用Map+List。

### 技巧性：

	        for(int num : nums1){
	            map.put(num,map.getOrDefault(num,0)+1);
	        }
	        for(int num : nums2){
	            if(map.containsKey(num)&&map.get(num)>0){
	                list.add(num);
	                map.put(num,map.get(num)-1);
	            }
	        }