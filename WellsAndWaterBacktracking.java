package refreshConcepts;

import java.util.Arrays;

public class villageAndWells {



    public static void main(String[] args) {

        int n=5;
        int m=5;
        char[][] a={
                {'H','N','H','H','H'},
                {'N','N','H','H','W'},
                {'W','H','H','H','H'},
                {'H','H','H','H','H'},
                {'H','H','H','H','H'}
        };

        int[][] output= new int[n][m];
        boolean[][] visited= new boolean[n][m];
        for(int[] x:output){
            Arrays.fill(x,99);
        }

        for(boolean[] v:visited){
            Arrays.fill(v,false);
        }

        for(int i=0;i<n;i++){
           for( int j=0;j<m;j++){
                  if(a[i][j]=='H' && output[i][j]==99){
                      int[] dataset= new int[1];
                      dataset[0]=(int)(1e9);
                             output[i][j] = checkForNearestWell(i,j,a,visited,0,dataset);
                             reset(visited);
                  }else{
                      output[i][j]=0;
                  }
            }
        }

        for(int [] y: output){
            System.out.println(Arrays.toString(y));
        }
    }

    private static void reset(boolean[][] visited) {

        for(boolean[] c:visited){
            Arrays.fill(c,false);
        }
    }

    private static int checkForNearestWell(int x, int y, char[][] a,boolean[][] visited,int dis,int[] dataset) {
        int[] rowShift = {-1, 0, 1, 0};
        int[] colShift = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {

            int nrow = x + rowShift[i];
            int nCol = y + colShift[i];

            if (nrow >= 0 && nrow < a.length && nCol >= 0 && nCol < a.length ) {
                if(a[nrow][nCol]=='H' && !visited[nrow][nCol]){
                    visited[nrow][nCol]=true;

                  checkForNearestWell(nrow,nCol,a,visited,dis+2,dataset);

                  visited[nrow][nCol]=false;


               }else if(a[nrow][nCol]=='W' && dataset[0]>dis+2){

                    dataset[0]=dis+2;
                   return dis+2;

               }

            }
        }
        return dataset[0]==(int)(1e9) ? -1 :dataset[0];
    }
}
