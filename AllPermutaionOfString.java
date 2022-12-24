package practice;

public class AllPermutaionOfString {

    public static void main(String[] args) {
        String s="abc";
        permute(s,0,s.length()-1);
    }

    private static void permute(String s, int i, int i1) {

        if(i==i1){
            System.out.println(s);
        }

        for(int j=i;j<=i1;j++){
            s=swap(s,i,j);
            permute(s,i+1,i1);
            s=swap(s,i,j);
        }
    }

    private static String swap(String s, int i, int j) {

        char[] a=s.toCharArray();

        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        String str= new String(a);
        return str;
    }
}
