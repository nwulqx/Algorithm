# 70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

# Solution

>简单的动态规划问题，可以使用递归的方法，但是当n比较大时，出现了超时。<br>
>或者生成动态数组，不需要全部生成，由于一次只能跳1步或者2步，所以，只需要知道上一次或者上两次的方法有多少种。