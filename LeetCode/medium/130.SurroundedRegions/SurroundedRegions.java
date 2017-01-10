public class SurroundedRegions{
	public static void main(String []args){
		char [][]board = {
			{'X', 'O' ,'X', 'X'},
			{'X', 'O' ,'X', 'X'},
			{'X', 'X' ,'O', 'X'},
			{'X', 'O' ,'X', 'X'},
			{'X', 'X' ,'X', 'X'},
			{'X', 'O' ,'X', 'X'}

		};
		solve(board);
    	for(int k=0;k<board.length;k++){
    		for(int g=0;g<board[0].length;g++){
				System.out.print(board[k][g]+"\t");
    		}
    		System.out.println();
    	}
	}
    public static void solve(char[][] board) {
        if(board.length==0)
            return;
    	int m = board.length;
    	int n = board[0].length;
    	//First column and last column;
    	for(int i=0;i<m;i++){
    		if(board[i][0] == 'O')
    			help(board,i,0);
    		if(board[i][n-1] == 'O')
    			help(board,i,n-1);
    	}
    	//First line and last line;
    	for(int j=0;j<n;j++){
    		if(board[0][j] == 'O')
    			help(board,0,j);
    		if(board[m-1][j] == 'O')
    			help(board,m-1,j);
    	}
    	//for 'O' ,board[i][j] = 'X';
    	//for '*' ,board[i][j] = 'O';
    	//others is invariant.
    	for(int k=0;k<m;k++){
    		for(int g=0;g<n;g++){
    			if(board[k][g]=='O')
    				board[k][g] = 'X';
    			if(board[k][g] == '*')
    				board[k][g] = 'O';
    		}
    	}
    }
    public static void help(char[][] board, int i, int j){
    	if(i>board.length-1 || i<0 || j>board[0].length-1 || j<0)
    		return;
    	if(board[i][j] == 'O')
    		board[i][j] = '*';
    	if(i<board.length-2 && board[i+1][j] == 'O')
    		help(board,i+1,j);
    	if(i>1 && board[i-1][j] == 'O')
    		help(board,i-1,j);
    	if(j<board[0].length-2 && board[i][j+1] == 'O')
    		help(board,i,j+1);
    	if(j>1 && board[i][j-1] == 'O')
    		help(board,i,j-1);
    }
}