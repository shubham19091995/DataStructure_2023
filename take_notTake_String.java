package Tabulation;

import java.util.Arrays;

public class take5 {

    public static void main(String[] args) {
        String s1 = "shubham";
        String s2 = "ubsjhubahhdsajbha";


        System.out.println(getMaxCountMatched(s1,s2,s1.length()-1,s2.length()-1));

        String[][] dp= new String[s1.length()+1][s2.length()+1];
        for(String[] d:dp){
            Arrays.fill(d,"");
        }

      // we are making all strings as null because it will give null pointer exception when we will try to operate dp , check below

        String s= "";
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=s1.charAt(i-1)+dp[i - 1][j - 1];  // see , we are starting from i=1 and j=1 because its top down approach in tabulation so we need to check previous , right . thats why i have s1.charAt(i-1) and s2.charAt(j-1) but since at present codition we are standng on 1 so we need to fill present condition based on previous , thats what i idid 
                }else{
                    String s5=dp[i][j-1];
                    String s6=dp[i-1][j];
                    dp[i][j]=s5.length()>s6.length() ? s5 :s6;
                }
            }
        }

        for(String[] g:dp){
            System.out.println(Arrays.toString(g));
        }


    }

    private static int getMaxCountMatched(String s1, String s2, int i, int j) {

        if(i<0 || j<0){
            return 0;
        }

        int take=0;
        if(s1.charAt(i)==s2.charAt(j)){
            take=1+getMaxCountMatched(s1,s2,i-1,j-1);
        }

        int notTake=Math.max( getMaxCountMatched(s1,s2,i,j-1),
                getMaxCountMatched(s1,s2,i-1,j));

        return Math.max(take,notTake);
    }
}
