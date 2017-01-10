# 241. Different Ways to Add Parentheses

Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.


Example 1

Input: "2-1-1".

	((2-1)-1) = 0
	(2-(1-1)) = 2

Output: [0, 2]


Example 2

Input: "2*3-4*5"

	(2*(3-(4*5))) = -34
	((2*3)-(4*5)) = -14
	((2*(3-4))*5) = -10
	(2*((3-4)*5)) = -10
	(((2*3)-4)*5) = 10

Output: [-34, -14, -10, -10, 10]

# Solution

>这道题说句实话，是归治中比较难的了。<br>

>但是感觉很经典，这个题主体是按层次遍历，不同层次可能执行不同的运算。采用递归的方法，让我联想到了归并排序算法，先按照运算符切割，从最基本的元素开始运算，一直返回到第一层。

分析：

	    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*'){
                List<Integer> leftList = diffWaysToCompute(input.substring(0,i));
                List<Integer> rightList = diffWaysToCompute(input.substring(i+1));
			//一开始还在考虑为什么这里是双层循环，想的是返回一个运算符的左右两端分别只有一个数字；
			//但其实不是，因为其实是按照层遍历的，递归中的下一层返回的可能是多个结果。
                for(int p1:leftList){
                    for(int p2: rightList){
                        Integer c = 0;
                        switch(input.charAt(i)){
                            case '+':
                                c = p1+p2;
                                break;
                            case '-':
                                c = p1-p2;
                                break;
                            case '*':
                                c = p1*p2;
                                break;
                        }
                        res.add(c);
                    }
                }
            }
        }
		//当集合中没有元素时，说明达到了最底层，即input字符串中不存在运算符
        if(res.size()==0){
            res.add(Integer.parseInt(input));
        }
        return res;
    }

输入：

	2-1-1

结果：
	(2-(1-1)) = 2
	((2-1)-1) = 0
	
第一层分成了两种：

	2和(1-1)
	(2-1)和1
	
第二层分成了：

	1和1
	2和1

附每层运算结果：

	[2]
	[1]
	[1]
	[0]
	[2]
	[1]
	[1]
	[1]
	[2, 0]

分析：

>第一个`2`是第一层`2和(1-1)`中的，然后递归遍历；<br>
>第二个`2`是`(2-1)和1`中的第二层分治得到的`2`;<br>
>两个`是不同的层`参与了和不同对象的相同运算。