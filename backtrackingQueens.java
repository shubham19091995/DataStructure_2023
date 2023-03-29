package Backtracking;

import java.util.Arrays;

public class backtrackingQueens {

    public static void main(String[] args) {

        int chessBoardSize=4;
        String[][] chessBoard= new String[chessBoardSize][chessBoardSize];

        for(String[] s:chessBoard){
            Arrays.fill(s,"N");
        }

        int[] count= new int[1];
        getQueensPosition(chessBoard,0,chessBoardSize,count);
        System.out.println(Arrays.toString(count));



    }

    private static void getQueensPosition(String[][] chessBoard,int startPoint, int chessBoardSize, int[] count) {

        // startPoint is column of chess board

        if(startPoint==chessBoardSize){
            Arrays.stream(chessBoard).forEach(c-> System.out.println(Arrays.toString(c)));

            count[0]++;

            System.out.println();
            System.out.println();
            return;
        }

        for(int i=0;i<chessBoardSize;i++){
            if(isPositionFine(chessBoard,i,startPoint)){
                chessBoard[startPoint][i]="Q";
                getQueensPosition(chessBoard,startPoint+1,chessBoardSize,count);
                chessBoard[startPoint][i]="N";
            }
        }
    }

    private static boolean isPositionFine(String[][] chessBoard,int row, int col) {
        int[] rowColStorage=new int[2];
        rowColStorage[0]=col;
        rowColStorage[1]=row;

        while (row>=0 && col>=0){
            if(chessBoard[col][row].equals("Q")){
                return false;
            }
            row--;
            col--;
        }

        col=rowColStorage[0];
        row=rowColStorage[1];

        while (col>=0){
            if(chessBoard[col][row].equals("Q")){
                return false;
            }
            col--;
        }


        col=rowColStorage[0];
        row=rowColStorage[1];

        while (row<chessBoard.length && col>=0){
            if(chessBoard[col][row].equals("Q")){
                return false;
            }
            row++;
            col--;
        }
return true;
    }
}
