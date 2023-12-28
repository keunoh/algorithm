package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Back1992 {

    public static int[][] board;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        partition(0, 0, N);

        System.out.println(sb.toString());
    }

    static void partition(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            sb.append(board[row][col]);
            return;
        }

        int newSize = size / 2;
        //newSize = 1
        // 0, 0, 1
        // 0, 0 + 1, 1
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        sb.append(")");
    }

    static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    sb.append("(");
                    return false;
                }
            }
        }
        return true;
    }
}
