package practice;

public class AllSubsetOfString {

    public static void main(String[] args) {
        String s="abc";
        String cur="";
        subset(s,0,cur);
    }

    private static void subset(String s, int i, String cur) {

        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        subset(s,i+1,cur+s.charAt(i));
        subset(s,i+1,cur);
    }


}
