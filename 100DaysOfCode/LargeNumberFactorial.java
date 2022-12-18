import java.math.BigInteger;

public class LargeNumberFactorial {
    static BigInteger factorial(int n){
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        int N = 100;
        System.out.println(factorial(N));
    }
}
