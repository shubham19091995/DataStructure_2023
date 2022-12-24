package practice;

import java.util.Arrays;

public class chessBoard {

    public static void main(String[] args) {
        int board[][] = {

                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };

        if(solveNQUTil(board,0)==true){
            for(int[] c:board){
                System.out.println(Arrays.toString(c));
            }
        }
    }

    private static boolean solveNQUTil(int[][] board, int col) {
        if(col==board.length){
            return true;
        }
        for(int i=0;i<board.length;i++){

            if(isSafe(board,i,col)) {
                board[i][col] = 1;


                if (solveNQUTil(board, col + 1) == true) {
                    return true;
                }

                board[i][col] = 0;
            }

        }
        return  false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {

        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            System.out.println("iud   "+i+"   "+j+"    "+row+"    "+col );
            if (board[i][j] == 1) {
                return false;
            }
        }
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--) {
            System.out.println("fjh   "+i+"   "+j+"    "+row+"    "+col );
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
