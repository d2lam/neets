class TicTacToe {
    private int n;
    private int[][] board;


    public TicTacToe(int n) {
        this.n = n;
        this.board = new int[n][n];
    }
    
    public int move(int row, int col, int player) {
        int value = (player == 1) ? 1 : -1;

        board[row][col] = value;
        if (check()) {
            return player;
        }
        return 0;
    }
    
    private boolean check() {       
        for (int i = 0; i < n; i++) {
            int val = 0;
            for (int j = 0; j < n; j++) {
                val += board[i][j];
            }
            if (Math.abs(val) == n) return true; 
        }

        for (int j = 0; j < n; j++) {
            int val = 0;
            for (int i = 0; i < n; i++) {
                val += board[i][j];
            }
            if (Math.abs(val) == n) return true; 
        }

        int valD = 0;
        for (int i = 0; i < n; i++) {
            valD += board[i][i]; 
        }
        if (Math.abs(valD) == n) return true; 

        valD = 0;
        for (int i = 0; i < n; i++) {
            valD += board[i][n-1-i]; 
        }
        if (Math.abs(valD) == n) return true; 

        return false;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */