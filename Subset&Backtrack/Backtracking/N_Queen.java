package Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(nqueen(0, board));
    }

    private static int nqueen(int row, boolean[][] board) {
        if (row == board.length) {
            Display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (setposition(board, row, col)) {
                board[row][col] = true;
                count += nqueen(row + 1, board);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean setposition(boolean[][] board, int row, int col) {
        int r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    private static void Display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("Q ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
