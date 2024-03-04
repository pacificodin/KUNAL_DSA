package Backtracking;

public class Sukodu {
    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
        if (SukoduBox(board)) {
            Display(board);
        } else {
            System.out.println("For this input not possible;");
        }
    }

    private static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean SukoduBox(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean allfill = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    allfill = false;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (allfill == false) {
                break;
            }
        }
        if (allfill == true) {
            // mean we got solution
            return true;
        }
        for (int num = 1; num <= 9; num++) {
            if (IsSafe(board, row, col, num)) {
                board[row][col] = num;
                if (SukoduBox(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static boolean IsSafe(int[][] board, int row, int col, int num) {
        // row checking
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }
        // now checking for coloum
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == num) {
                return false;
            }
        }
        // Now checking inside the box
        int sqrt = (int) (Math.sqrt(board.length));
        int rowstart = row - (row % sqrt);
        int colstart = col - (col % sqrt);

        for (int r = rowstart; r < rowstart + sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        // if false not return that's mean we can insert the value
        return true;
    }
}
