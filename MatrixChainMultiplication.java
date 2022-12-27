import java.util.Arrays;

public class max {

    public static void main(String[] args) {
        int[] a = { 40, 20, 30, 10, 30 };

        int [][] data= new int[a.length+3][a.length+3];
        for(int[] x:data){
            Arrays.fill(x, -1);
        }

        System.out.println(pass(a, 1, a.length - 1,data));
    }

    private static int pass(int[] a, int i, int j,int[][] data) {

        if (i >= j) {
            return 0;
        }

        if(data[i][j]!=-1){
            return data[i][j];
        }
        int temp = (int)(1e9);
        for (int m = i; m < j; m++) {
         
            data[i][j]= a[i - 1] * a[m] * a[j] + pass(a, i, m,data) + pass(a, m + 1, j,data);
            temp=Math.min(temp,data[i][j]);
        }

        return temp;

    }

}
