import java.util.ArrayList;

public class rec {
static ArrayList<Integer> ab= new ArrayList<>();
    public static void main(String[] args) {
         int[] a={3,1,2};

         findff(a,ab,0,3);
    }
    private static void findff(int[] a, ArrayList<Integer> ab2,int start,int end) {

        if(start==end){
            System.out.println(ab);
          //  ab.removeAll(ab);
            return;
        }
        ab2.add(a[start]);
        findff(a, ab2, start+1, end);
        
        ab2.remove(ab2.size()-1);
        findff(a, ab2, start+1, end);
    }
    
}
