package step2;

import java.util.Scanner;

public class Back2630 {

    static int white = 0;
    static int blue = 0;
    static int[][] board;

    public static void main(String[] args) {
        int N = 4;

        partition(0, 0, N);
    }

    static void partition(int row, int col, int size) {

        if(colorCheck(row, col, size)) {
            if(board[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        partition(row, col, newSize);                               // 2사분면
        partition(row, col + newSize, newSize);				    // 1사분면
        partition(row + newSize, col, newSize);				// 3사분면
        partition(row + newSize, col + newSize, newSize);	// 4사분면
    }

    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

}













