package com.company.backtracking;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
//        ArrayList<String> res = new ArrayList<>();
//        printFindPaths(arr, 0, 0, "", res);
//        System.out.println(res);
//        printRatInAMaze(arr, 0, 0, "");
//        boolean[][] chess = new boolean[4][4];
//        ans = new ArrayList<>();
//        nQueens(chess, 0, 0, new ArrayList<>());
//        System.out.println("ans = " + ans);
        char[][] sudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(sudoku, 0);
        printBoard(sudoku);

    }

    //    https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/
    public static void printFindPaths(int[][] m, int r, int c, String psf, ArrayList<String> res) {
        if (r == m.length - 1 && c == m[0].length - 1) {
            res.add(psf);
            return;
        }
        m[r][c] = 0;
        if (r - 1 >= 0 && m[r - 1][c] == 1) {
            printFindPaths(m, r - 1, c, psf + "U", res);
        }
        if (r + 1 < m.length && m[r + 1][c] == 1) {
            printFindPaths(m, r + 1, c, psf + "D", res);
        }
        if (c - 1 >= 0 && m[r][c - 1] == 1) {
            printFindPaths(m, r, c - 1, psf + "L", res);
        }
        if (c + 1 < m[0].length && m[r][c + 1] == 1) {
            printFindPaths(m, r, c + 1, psf + "R", res);
        }
        m[r][c] = 1;
    }

    public static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static char[] dirChar = {'U', 'R', 'D', 'L'};

    public static void printRatInAMaze(int[][] m, int r, int c, String psf) {
        if (r == m.length - 1 && c == m[0].length - 1) {
            System.out.println(psf);
            return;
        }
        m[r][c] = 0;
        for (int i = 0; i < dir.length; i++) {
            int dr = dir[i][0];
            int dc = dir[i][1];
            int nr = dr + r;
            int nc = dc + c;
            if (nr >= 0 && nr < m.length && nc >= 0
                    && nc < m[0].length && m[nr][nc] == 1) {
                printRatInAMaze(m, nr, nc, psf + dirChar[i]);
            }
        }
        m[r][c] = 1;
    }

    //    https://practice.geeksforgeeks.org/problems/n-queen-problem0315/
    static ArrayList<ArrayList<Integer>> ans;

    public static void nQueens(boolean[][] chess, int r,
                               int c, ArrayList<Integer> qpsf) {
        if (r == chess.length) {
            ArrayList<Integer> res = new ArrayList<>(qpsf);
            ans.add(res);
            return;
        }
        boolean canBePlaced = canQueenBePlaced(chess, r, c);
        if (canBePlaced) {
            chess[r][c] = true;
            qpsf.add(c + 1);
            nQueens(chess, r + 1, 0, qpsf);
            chess[r][c] = false;
            qpsf.remove(qpsf.size() - 1);
        }
        if (c + 1 < chess.length) {
            nQueens(chess, r, c + 1, qpsf);
        }
    }

    static int[][] queenDirections = {{-1, -1}, {-1, 0}, {-1, 1}};

    public static boolean canQueenBePlaced(boolean[][] chess, int r, int c) {
        for (int i = 0; i < queenDirections.length; i++) {
            int dr = queenDirections[i][0];
            int dc = queenDirections[i][1];
            int nr = r;
            int nc = c;
            while (nr + dr >= 0 && nc + dc >= 0 && nc + dc < chess.length) {
                nr += dr;
                nc += dc;
                if (chess[nr][nc]) return false;
            }
        }
        return true;
    }

    public static boolean solveSudoku(char[][] board, int total) {
        if (total == 81) {
            return true;
        }
        int r = total / 9;
        int c = total % 9;
        if (board[r][c] != '.') return solveSudoku(board, total + 1);
        for (int i = 1; i <= 9; i++) {
            char k = (char) (i + '0');
            if (canElementBePlaced(board, r, c, k)) {
                board[r][c] = k;
                if (solveSudoku(board, total + 1)) return true;
                board[r][c] = '.';
            }
        }
        return false;
    }

    public static boolean canElementBePlaced(char[][] board, int r, int c, char k) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == k) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == k) return false;
        }
        int sr = r - (r % 3);
        int sc = c - (c % 3);
        for (int i = sr; i <= sr + 2; i++) {
            for (int j = sc; j <= sc + 2; j++) {
                if (board[i][j] == k) return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
