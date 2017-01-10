# 383. Ransom Note

 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

**Note:**

You may assume that both strings contain only lowercase letters.

	canConstruct("a", "b") -> false
	canConstruct("aa", "ab") -> false
	canConstruct("aa", "aab") -> true

# Solution

这题比较无聊，反正怎么想就可以怎么做。我的思路是：

1. 遍历ransomNote字符，每取到一个字符，去magazine字符串中查找是否存在；
2. 如果存在，则置true，并将当前值置为`\t`或者 `\n`；
3. 如果不存在，则置false，返回。
4. 外层循环需要判断，如果为false，则应该跳出循环，返回false。