package Backtracking;

import java.util.Arrays;

public class dp2 {

    public static void main(String[] args) {
        int[] a={2,11,9,3};

        System.out.println(getMax(a,a.length-1));

        
         // dp starts here 
        
        
        int[] dp= new int[a.length];

        Arrays.fill(dp,0);

        for(int i=1;i<a.length;i++){
            int take=a[i];
            if(i>1){
                take+=dp[i-2];
            }
            int nonTake=0+dp[i-1];


            dp[i]=Math.max(take,nonTake);
        }

        System.out.println(Arrays.toString(dp));


    }

    private static int getMax(int[] a, int i) {

        if(i<0){
            return 0;
        }

        int take=a[i]+getMax(a,i-2);
        int notTake=getMax(a,i-1);

        return Math.max(take,notTake);
    }
}
