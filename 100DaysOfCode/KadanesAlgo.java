import java.util.Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if(sum>maxSum){
                maxSum=sum;
            }
            if (sum<0) {
                maxSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
