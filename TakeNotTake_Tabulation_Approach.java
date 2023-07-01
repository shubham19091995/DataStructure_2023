package Backtracking;

import javax.naming.ldap.spi.LdapDnsProvider;
import java.util.Arrays;

public class TakeNotTake_Tabulation_Approach {

    public static void main(String[] args) {
        int target=7;
        int[] a={1,2,3,1,4,9};


        System.out.println(recursionApproach(a,a.length-1,target));


        // TODO: Tabulation Approach


        int[][] data= new int[a.length+1][target+1];  

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(i==0){
                    data[i][j]=(int)(1e9);
                }
                else
                if(j==0){
                    data[i][j]=0;
                }
            }
        }




      // We are not doing anything with 0 index thats why we use iteration from 1 , just check the recursion approach mentioned below

        for(int i=1;i<data.length;i++) {
            for (int j = 1; j < data[0].length; j++) {

                int take=Integer.MAX_VALUE;

                if(j>=a[i-1]){
                    take=1+data[i-1][j-a[i-1]];
                }

                int notTake=data[i-1][j];

                data[i][j]=Math.min(take,notTake);

            }

        }

        Arrays.stream(data).forEach(c-> System.out.println(Arrays.toString(c)));





    }

    private static int recursionApproach(int[] a, int i, int target) {
        if(i<0){
            if(target==0){
                return 0;
            }
            return (int)(1e9);
        }

        int take=Integer.MAX_VALUE;

        if(target>=a[i]){
            take=1+recursionApproach(a,i-1,target-a[i]);
        }

        int notTake=recursionApproach(a,i-1,target);

        return Math.min(take,notTake);

    }
}
