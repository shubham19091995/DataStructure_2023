import java.util.ArrayList;
import java.util.HashSet;

public class MatchStrings {
    static HashSet<ArrayList<Character>> ab= new HashSet<>();

    public static void main(String[] args) {
        String s1 = "shubham";
        String s2 = "ubjhubahhdsjshubha";

        char[] a = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        fun(a, a2, a.length - 1, a2.length - 1, new ArrayList<Character>());
        System.out.println(ab);
    }

    private static void fun(char[] a, char[] a2, int length, int length2, ArrayList<Character> arrayList) {

        if (length < 0 || length2 < 0) {
            return;
        }

        if (a[length] == a2[length2]) {
            arrayList.add(a[length]);
            ab.add(new ArrayList<Character>(arrayList));

            fun(a, a2, length - 1, length2 - 1, arrayList);

        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }

        fun(a, a2, length - 1, length2, arrayList);

        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }

        fun(a, a2, length, length2 - 1, arrayList);

        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }

    }

}
