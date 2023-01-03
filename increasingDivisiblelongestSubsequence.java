package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class increasing {

    public static void main(String[] args) {
        int[] a={1,16,7,8,4,2};

        Arrays.sort(a);

        System.out.println(get(a,a.length-1,new ArrayList<Integer>()));
    }

    private static  int get(int[] a, int end, ArrayList<Integer> integers) {


        if(end<0){
            return 0;
        }

        int nottake=0+get(a,end-1,integers);
        int take=0;
        if(checkdivisibility(integers,a[end])){
            integers.add(a[end]);
            take=1+get(a,end-1,integers);
            System.out.println(integers);
            integers.remove(integers.size()-1);
        }

        return  Math.max(take,nottake);

    }

    private static boolean checkdivisibility(ArrayList<Integer> integers, int i) {

        if(integers.isEmpty()){
            return true;
        }

        for(int val:integers){
            if(val>i){
                if(val%i!=0){
                    return  false;
                }
            }else if(val<i){
                if(i%val!=0){
                    return false;
                }
            }
        }

        return  true;
    }

}


