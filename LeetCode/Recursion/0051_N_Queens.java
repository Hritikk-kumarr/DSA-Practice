import java.util.*;

class Solution {
    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> posDiag = new HashSet<>();
    private Set<Integer> negDiag = new HashSet<>();
    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, n, board);
        return result;
    }

    private void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || posDiag.contains(row + col) || negDiag.contains(row - col)) {
                continue;
            }

            board[row][col] = 'Q';
            cols.add(col);
            posDiag.add(row + col);
            negDiag.add(row - col);

            backtrack(row + 1, n, board);

            board[row][col] = '.';
            cols.remove(col);
            posDiag.remove(row + col);
            negDiag.remove(row - col);
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            internal.add(new String(board[i]));
        }
        return internal;
    }
}