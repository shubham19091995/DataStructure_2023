package Backtracking;

public class dp3 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,2,2};

        int target=7;

        System.out.println(get(a,target,a.length-1));

        int n = a.length;
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= a[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], 1 + dp[i - 1][j - a[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][target]);
    }

    private static int get(int[] a, int target, int i) {

        if(i<0){
            return 0;
        }

        int take=0;
        if(target>=a[i]){
            take=1+get(a,target-a[i],i-1);
        }
        int notTake=get(a,target,i-1);

        return Math.max(take,notTake);
    }
}
