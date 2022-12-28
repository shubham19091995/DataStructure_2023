import java.util.Arrays;

class books
{
    public static void main(String[] args) {
        
       int[] a={15,17,20};
       int part=2;
       //Arrays.sort(a);
       int low=a[0];
       int high=sum(a);
       int res=0;

       while(low<=high){

        int mid=(low+high)>>1;

        if(allocation(a,mid,part)){
         res=mid;
            high=mid-1;
           
        }else if(!allocation(a,mid,part)){
            
            low=mid+1;
        }
       }

       System.out.println(res);


    }

    private static boolean allocation(int[]a ,int mid,int part) {

        int pages=0;
        int students=1;

        for(int i=0;i<a.length;i++){
            if(a[i]>mid){
                return false;
            }else{
                if(a[i]+pages>mid){
                    students++;
                    pages=0;
                    pages+=a[i];
                }else{
                    pages+=a[i];
                }

            }
        }

        if(students>part){
            return false;
        }else{
        return true;
        }
    }

    private static int sum(int[] a) {

        int sum=0;

        for(int x:a){
            sum+=x;
        }
        return sum;
    }



}
