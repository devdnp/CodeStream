import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String a1 = "listen";//scan.next();
        String b1 = "silent" ;//scan.next();
        char[] a = a1.toCharArray();
        char[] b = b1.toCharArray();
        boolean result = isAna(a,b);
        System.out.println(result ?"Anagram":"Not anagram");
    }
    static boolean isAna(char[] a, char[] b){
        if (a.length!=b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[i]) {
                return false;
            }
        }

        return true;
    }
}
