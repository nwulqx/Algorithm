# 223. Rectangle Area

Find the total area covered by two **rectilinear** rectangles in a **2D** plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

![](http://i.imgur.com/IsyTUW2.png)

Assume that the total area is never beyond the maximum possible value of **int**.

# Solution

观察发现，相交的区域内，左下角的坐标为(A,B)和(E,F)中的x和y坐标中较大的值组成。

而相交的区域内的右上角的坐标为：(C,D)和(G,H)中x和y坐标中较小的值组成。

那这样做，就很简答了。

## Attention

>很喜欢这个做法，因为我也曾尝试这么做，但是放弃了。<a href="https://discuss.leetcode.com/topic/17534/if-you-want-to-laugh-look-at-my-solution/13">Link</a>