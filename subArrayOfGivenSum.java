import java.util.HashMap;

class hello {
    public static void main(String[] args) {
        int[] a = { 10, 15, -5, 15, -10, 5 };

        int sum = 5;

        HashMap<Integer, Integer> values = new HashMap<>();
        int currentSum=0;


     for(int i=0;i<a.length;i++){
        currentSum+=a[i];
        values.put(currentSum, i);

        if(currentSum-sum==0){
            System.out.println("Got It ");
            break;
        }

        if(values.containsKey(currentSum-sum)){
            System.out.println("Got it");
        }

     }

    }
}
