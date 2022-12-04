import java.util.HashMap;
import java.util.Map;

public class UnionIntersectionTwo {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 2, 3, 6};
        int[] b ={3, 8, 6, 20, 7};

        printUnion(a, b);
        printIntersection(a, b);
    }

    static void printUnion(int[] a, int[] b){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            mp.put(a[i], i);
        }
        for (int i = 0; i < b.length; i++) {
            mp.put(b[i], i);
        }
        for (Map.Entry entry : mp.entrySet()) {
            System.out.print(entry.getKey()+" ");
        }
        System.out.println();
    }

    static void printIntersection(int[] a, int[] b){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            mp.put(a[i], i);
        }
        for (int i = 0; i < b.length; i++) {
            if(mp.containsKey(b[i])){
                System.out.print(b[i]+" ");
            }
        }

    }
}
