public class takeornottake2nd {

    public static void main(String[] args) {
        int[] a={1,2,3,4,4,5,6};
        int sum=25;

        System.out.println(get(a,sum,a.length));
    }

    private static boolean get(int[] a, int sum, int length) {

        if(length<0){
            return false;
        }
        if(length==0){
            return sum-a[length]==0;
        }
       
        return get(a, sum, length-1) | get(a, sum-a[length-1], length-1);   // return Not Take Part  |  Take Part
    }
    
}
