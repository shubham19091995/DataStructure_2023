package Backtracking;

import java.util.ArrayList;

public class backtrackingPartitionpalindrome {

    public static void main(String[] args) {
        String s="aabb";

        getPa(s,0,new ArrayList<String>());
    }

    private static void getPa(String s, int i,ArrayList<String> values) {
        if(i==s.length()){

            System.out.println(values);

            return;
        }

        for(int x=i;x<s.length();x++) {
            if (isPalindrome(s, i,x)) {
                values.add(s.substring(i, x + 1));
                getPa(s, x + 1, values);
                values.remove(values.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int i,int last) {

        while (i<=last){
            if(s.charAt(i++)!=s.charAt(last--)){
                return false;
            }
        }
        return true;
    }
}
