#暴力解法：
>生成numRows个StringBuffer对象;<br>
>从0到n-1循环添加元素，再从n-2到1循环添加元素，n做StringBuffer数组对象的索引；<br>
>外层使用while循环，自增通过索引内 i++。

        while(i<str.length){
        	for(int j=0;j<numRows&&i<str.length;j++)
        		sb[j].append(str[i++]);
        	
        	for(int k=numRows-2;k>0&&i<str.length;k--)
        		sb[k].append(str[i++]);
        }

时间复杂度是O(n*str.length)。

#指针法：
>该方法的精髓在于：建立新的数组存储每一个元素对应的新数组的索引（需要先建立numRows个StringBuffer对象）
![](http://i.imgur.com/R4pTry7.png)

其时间复杂度为O(n)。