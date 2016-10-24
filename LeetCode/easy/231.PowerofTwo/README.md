# 231. Power of Two

Given an integer, write a function to determine if it is a power of two.

# Solution

>三种方法:<br>
>1. Brute Force：除模运算，直到为1。<br>
>2. 二的幂次方的特点是：首位二进制为1，其余位是0。利用这个特点，可以使用n&(n-1)==0来判断是否为2的次方。<br>
>3. 利用除法，已知int中2的最大幂次方是Integer.MAX_VALUE+1，可以用它，也可用(Integer.MAX_VALUE+1)/2，然后取模运算。