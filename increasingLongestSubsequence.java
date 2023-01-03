package DynamicProgramming;

public class increasing {

    public static void main(String[] args) {
        int[] a={10,9,2,5,3,7,101,18};

        System.out.println(get(a,0,-1));
    }

    private static int get(int[] a, int start, int prev) {

        if(start==a.length){
            return 0;
        }

        int nottake=0+get(a,start+1,prev);
        int take=0;
        if(prev==-1 || a[prev]<a[start]){
            take=1+get(a,start+1,start);
        }

        return  Math.max(nottake,take);


    }
}


