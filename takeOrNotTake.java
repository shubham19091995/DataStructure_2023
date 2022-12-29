public class takeornottake {

    public static void main(String[] args) {

        int[] a={2,1,5,4,7,3,2};
        int target=12;

        System.out.println(ispresent(a,a.length-1,target));
        
    }

    private static boolean ispresent(int[] a, int length, int target) {

        if(length<0){
            return false;
        }
                if(length==0){
            return target-a[length]==0;
        }

        if(target==0){
            return true;
        }

        boolean notTake=ispresent(a, length-1, target);
        boolean take=false;
        if(a[length]<=target){
            take=ispresent(a, length-1, target-a[length]);
        }
        return take | notTake;
    }
    
}
