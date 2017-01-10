# 130. Surrounded Regions

Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

For example,

	X X X X
	X O O X
	X X O X
	X O X X

After running your function, the board should be:

	X X X X
	X X X X
	X X X X
	X O X X

# Solution

## DFS深度优先遍历

**思路**：

1. 从外层开始，第一行和最后一行，第一列和最后一列开始遍历，如果碰到`O`字符，则应该在此处标记，并进入DFS；
2. 进入DFS后，应该对临接的`O`字符进行判断，同时也进行标记，具体的标记从四个方向开始；
3. 全部的DFS标记结束后，对于没有遍历到的字符`o`，应该置为`X`，说明此处`O`被`X`所包围。

## BFS广度优先遍历