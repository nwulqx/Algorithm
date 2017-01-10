# 319. Bulb Switcher

There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.

Example:

	Given n = 3. 

	At first, the three bulbs are [off, off, off].
	After first round, the three bulbs are [on, on, on].
	After second round, the three bulbs are [on, off, on].
	After third round, the three bulbs are [on, off, off]. 

	So you should return 1, because there is only one bulb is on.

# Solution

从1~n，数字n将被访问偶数次，前提是n不是一个可以开平方的数。
那么，当n为一个平方数时，n将被访问奇数次，处于打开状态。

而要计算一个小于n的数中有几个开方数，只需对n求平方根即可。