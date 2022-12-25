import java.util.HashMap;

class hello {
    public static void main(String[] args) {
 int[] a = { 10, 15, -5, 15, -10, 5 };

        int sum = 5;
        int start=0;
        int end=-1;

        HashMap<Integer, Integer> values = new HashMap<>();
        int currentSum=0;


     for(int i=0;i<a.length;i++){
        currentSum+=a[i];
       

        if(currentSum-sum==0){
            start=0 ;end=i;
            break;
        }

        if(values.containsKey(currentSum-sum)){
            start=values.get(currentSum-sum)+1;
            end=i;
            break;
        }
        values.put(currentSum, i);

     }

     if(end==-1){
        System.out.println("Not Found");
     }
     else{
        System.out.println(start+"   "+end);
     }

    }
}
