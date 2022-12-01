// import java.util.Scanner;
public class PallindromeOne {
    public static void main(String[] args) {
        
        // Scanner sc=new Scanner(System.in);
        String A= "abcdcba";     //sc.next();

        String B = new StringBuilder(A).reverse().toString();
        if(A.equals(B))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}