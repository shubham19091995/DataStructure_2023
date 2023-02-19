public class knap3 {

    public static void main(String[] args) {
        int[] a={4,2,2,3};
        int x=8;



        System.out.println(get(a,a.length-1,x));
    }

    private static int get(int[] a, int length, int x) {
        if(length<0){
            if(x==0){
                return 0;
            }
            return (int)(1e9);
        }

        int nottake=get(a,length-1,x);
        int take=Integer.MAX_VALUE;
        if(a[length]<=x){
            take=1+get(a,length-1,x-a[length]);
        }

        return Math.min(take,nottake);
    }
}
