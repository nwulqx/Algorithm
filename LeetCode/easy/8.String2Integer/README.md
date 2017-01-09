#
String to Integer (atoi)

Implement atoi to convert a string to an integer.

**Hint**: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

**Notes**: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

##需要的考虑：
>1.前面的空格需要去除，从第一个非空数字开始取，一直到第一个非数字字符为止。<br>
>2.int最大最小值的问题需要考虑。

```java
public class Solution {
    public int myAtoi(String str) {
        if(str.length()==0)
            return 0;
        int start = 0;
        while(start<str.length()-1 && (str.charAt(start)>'9' || str.charAt(start)<'0')){
            if(str.charAt(start)=='+' || str.charAt(start)=='-')
                break;
            start ++;
        }
        int end = start;
        // System.out.println(end<str.length()-1 && (str.charAt(end+1)=='+' || str.charAt(end+1)=='-'));
        if((end<str.length()-1 && (str.charAt(end+1)=='+' || str.charAt(end+1)=='-')) && (str.charAt(end)=='+' || str.charAt(end)=='-'))
                return 0;
        while(end<str.length()){
            if(str.charAt(end)>='0'&&str.charAt(end)<='9')
                end++;
        }
        String temp =str.substring(start,end);
        if(temp.length()==0)
            return 0;
        try{
            long result = Long.parseLong(temp);
            if(result>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(result<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            return (int)result;
        }catch(Exception e){
            if(str.charAt(start)=='0')
                return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }
}
```

>先来看我的一个错误写法：

>1. String.substring()方法会造成很大的边界检测问题；这时候就要考虑根据长度来截取字符串了；
>2. String.charAt()方法的效率低于将字符串转化为char[]数组的效率，对于字符串的字符如果多操作，应该转化为char数组在进行。
