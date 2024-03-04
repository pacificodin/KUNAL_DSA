package Backtracking;

// import leetcode.reverse_the_word;

public class N_Knights {
    public static void main(String[] args) {
        int knight = 3;
        boolean[][] board = new boolean[knight][knight];
        System.out.println(N_Knight(board, 0, 0, 4));
    }

    static public int N_Knight(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        if (row == board.length - 1 && col == board.length) {
            return 0; // this is for when it occur the out of bond
        }
        if (col == board.length) { // to shift the new row
            N_Knight(board, row + 1, 0, knight);
            return 0;
        }

        if (SafePlace(board, row, col)) {
            board[row][col] = true;
            count += N_Knight(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }
        N_Knight(board, row, col + 1, knight);
        return count;
    }

    private static boolean SafePlace(boolean[][] board, int row, int col) {
        if (IsValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (IsValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (IsValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (IsValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean IsValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
