/*
0 1 
0 1 

2 3 
1 2 

4 5 6 7 
1 2 2 3 

8 9 10 11 12 13 14 15
1 2 2  3  2  3  3  4

found rules!

mod n = & (n-1)
*/
public class CountingBits{
    public int[] countBits(int num) {
    	int result[] = new int[num.length+1];
        for(int i=0;i<result.length;i++){
        	result[i] = result[i/2] + i%2;
        }
        return result;
    }
}