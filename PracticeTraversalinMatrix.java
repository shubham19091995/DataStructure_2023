import java.util.Arrays;

public class sub {

    public static void main(String[] args) {
        int[][] a = {
                { 1, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 1, 1, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1, 1, 1 }
        };

        boolean[][] visited = new boolean[a.length][a[0].length];

        for (boolean[] x : visited) {
            Arrays.fill(x, false);
        }

        getdata(a, visited, a.length - 1, a[0].length - 1);
    }

    private static void getdata(int[][] a, boolean[][] visited, int i, int j) {

        if (i < 0 || j < 0 || i > a.length - 1 || j > a[0].length - 1) {
            return;
        }

        if (i == 0 && j == 0) {
            System.out.println("reached");
            return;
        }

        if (a[i][j] == 1 && visited[i][j] == false) {
            System.out.println(i + "  " + j);
            visited[i][j] = true;
            getdata(a, visited, i+1, j+1);
            getdata(a, visited, i-1, j-1);
            getdata(a, visited, i-1, j+1);
            getdata(a, visited, i+1, j-1);
            getdata(a, visited, i + 1, j);
            getdata(a, visited, i - 1, j);
            getdata(a, visited, i, j - 1);
            getdata(a, visited, i, j + 1);

        }

    }

}
