#归并排序
##递归实现
>关键是如何优化递归排序，他的思路并不难，对数组进行递归分割，直到数组长度为1为止。<br>
>逐步按有序合并数组。<br>

##实现
###创建多少个数组？
>简单的思路：直接递归分隔数组，每分隔一次，就用两个数组存储。

    public static void MergeSort(int []list)
	{
		//数组分成的第一个部分
		if(list.length>1)
		{
			int []FirstList = new int[list.length/2];
			System.arraycopy(list, 0, FirstList, 0, list.length/2);
			MergeSort(FirstList);
		
			int []SecondList = new int[list.length-list.length/2];
			System.arraycopy(list, list.length/2, SecondList, 0, list.length-list.length/2);
			MergeSort(SecondList);
		
			//
			int []temp = Merge(FirstList,SecondList);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
虽然理解方便，但是创建了许多局部数组。来回的拷贝数组到新数组，增加了时间。

###解决
可以通过只增加一个数组，使用数组的指针来指定数组的哪些部分需要分隔，哪些部分需要归并。

思路可以参见汉诺塔的实现：

    public class Merge{
		public static void main(String []args){
			hanoi("source","mid","destination",4);
		}
		public static void hanoi(String sour,String mid,String dst,int n){
			if(n>0){
				hanoi(sour,dst,mid,n-1);
				System.out.println("第"+n+"层"+":"+sour+"-->"+dst);
				hanoi(sour,mid,dst,n-1);
			}
		}
	}

其实，他的层级递归次序是由n来决定

第n层 | source | mid | dst
----------- | ------------- | ------------- |------------- |
1 |   |  |√ |
2 |  | √ | |
3 |  |  |√ |
4 |  | √ | |
5 |  |   |√  |

>如果想放到dst目标下，则第一层一定需要放到目标位；则其上层需要放到mid。<br>
>现在倒着来看，则第n层需要到目标，则第n-1层需要放到mid，我们不需要知道n-1层以及n-2……等其他层怎么放置的，我们只需要设置好第n层的放置即可。<br>

#思考
    public static void hanoi(String sour,String mid,String dst,int n){
			if(n>0){
				hanoi(sour,dst,mid,n-1);
				System.out.println("第"+n+"层"+":"+sour+"-->"+dst);
				hanoi(sour,mid,dst,n-1);
			}
	}

>这段代码完成了整个递归，总感觉他把第一层直接放到了mid，但是，其实不是想象的那样。由于n以及hanoi(sour,dst,mid,n-1);的存在，当n=奇数时，第一层是放在了dst上（因为，随着n的改变，放置也在改变）。当n=偶数时，第一层其实是放在了mid上，这符合汉诺塔的玩法。