import java.util.HashSet;

public class UnionIntersectionOne{
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 2, 3, 6};
        int[] b ={3, 8, 6, 20, 7};

        printUnion(a, b);
        printIntersection(a, b);
    }

    static void printUnion(int[] a, int[] b){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);
        }
        System.out.println(hs);
    }

    static void printIntersection(int[] a, int[] b){
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (hs.contains(b[i])) {
                hs1.add(b[i]);
            }
        }
        System.out.println(hs1);
    }
}