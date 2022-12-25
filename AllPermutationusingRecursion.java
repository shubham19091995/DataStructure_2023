import java.util.ArrayList;
import java.util.Arrays;

public class allperutations {

    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1 };

        ArrayList<ArrayList<Integer>> out = new ArrayList<>();

        boolean[] freq = new boolean[a.length];
        Arrays.fill(freq, false);

        callcombination(out, a, freq, new ArrayList<Integer>());

        out.stream().forEach(c->System.out.println(c));
    }

    private static void callcombination(ArrayList<ArrayList<Integer>> out, int[] a, boolean[] freq,
            ArrayList<Integer> arrayList) {

        if (arrayList.size() == a.length) {
            out.add(new ArrayList<Integer>(arrayList));
            return;
        }

        for(int i=0;i<a.length;i++){
            if(!freq[i]){
                freq[i]=true;
                arrayList.add(a[i]);
                callcombination(out, a, freq, arrayList);
                arrayList.remove(arrayList.size()-1);
                freq[i]=false;
            }
        }

    }

}
