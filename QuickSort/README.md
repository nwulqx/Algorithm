#快速排序
快速排序的最优时间复杂度为O(nlogn)，情况是中间刚好为两边的大小分隔。<br>
**快排是从后面向前查找，直到第一个大于选定元素的值出现，就交换选定值和该值**<br>
快排的最差比较复杂度：序列有序（包括正序或者倒叙有序），则需要从前到后（或者从后到前）全部比较，n（n-1）/2，O（n2）的复杂度。
#关于if(hi<=lo)和if(i>=j) break;的看法
>一定是要加上等于判断的，因为每个数在递归时都会被遍历到，但是，如果是头尾元素。<br>
>例如：最后一个元素，不做(hi==lo)判断，接下来会去递归sort(a,i,i),那么低位和高位一致，但是算法要去寻找左边大于a[lo]的数和从最高位向下的大于a[lo]的数，那么当lo==hi，时，计算lo++会造成溢出。<br>
>关于跳出while循环的if(i>=j) 判断，如果没有=判断，那么即，i==j时（常出现在lo==hi的情况），此时，由于不满足条件（i>j），所以继续执行a[i++],但是，由于是数组的最后一个，那么会出现数组越界错误！

#思路：

##Repeat until i and j pointers cross. <br>

- Scan i from left to right so long as (a[i] < a[lo]). <br>
- Scan j from right to left so long as (a[j] > a[lo]). <br>
- Exchange a[i] with a[j].<br>

##When pointers cross. 

- Exchange a[lo] with a[j].

##比较java下的实现和js下的实现