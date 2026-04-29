class TicTacToe {
    private int n;
    int[] rows; // scores of the row
    int[] cols;
    int diag;
    int antiDiag;


    public TicTacToe(int n) {
        this.n = n;

        // cumulative score at a specific row
        this.rows = new int[n];
        this.cols = new int[n];
    }
    
    public int move(int row, int col, int player) {
        int value = (player == 1) ? 1 : -1;
        rows[row] += value;
        cols[col] += value;
        if (row == col) {
            diag += value;
        }
        if (row + col == n-1) {
            antiDiag += value;
        }

        if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diag) == n || Math.abs(antiDiag) == n) {
            return player;
        }

        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */