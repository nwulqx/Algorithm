# NimGame

You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

Show Hint 

## Summary

>这道题让我感到纠结的是,我本以为这是一道DP问题,略感复杂,但是,答案巧妙的利用了数学方法解决了这个问题.<br/>
但我仍然认为这道题仍应该采用解决DP的方法再去解决一遍!

>http://www.w2bc.com/article/120965
以上使用了两种方法来解决DP问题,递归和循环!但是,递归深度造成了了栈溢出,而循环又造成了内存溢出!
