# 191. Number of 1 Bits

Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the <a href ="https://en.wikipedia.org/wiki/Hamming_weight">Hamming weight</a>).

For example, the 32-bit integer ’11' has binary representation `00000000000000000000000000001011`, so the function should return 3.

# Solution

解法比较简单，需要注意两点：

1. 使用条件n!=0，而不是n>0，因为对于有符号数，n>0不成立;
2. 移位运算使用`>>>`，不是`>>`，需要使用无符号移位。