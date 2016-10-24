# 198. House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and **it will automatically contact the police if two adjacent houses were broken into on the same night.**

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight **without alerting the police.**

# Solution

>动态规划问题：偷这家房子的序列总额多，还是上一家房子的总额序列多的问题？不能单纯的把数组表示为，当前序列中所得到的总额。当前数组表示，所得到的最多的总额，而不是该位置获得的总额。

##错误的理解

>错误的理解了动态规划，动态规划中的数组表示的是当前状态值，而不是当前值，我把数组理解成当前所处位置所能拿到钱的总额；但其实不是，数组当前位置只是表示一种状态，他应该拿到的最大的总额。