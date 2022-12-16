import java.util.HashMap;

public class PairEqualsSum {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 5 };
        int sum = 6;
        System.out.println(getPairs(arr, arr.length, sum));
    }
    static int getPairs(int[] arr, int n, int sum){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!hash.containsKey(arr[i])){
                hash.put(arr[i], 0);
            }
            hash.put(arr[i], hash.get(arr[i])+1);
        }

        int twice_count = 0;
        for (int i = 0; i < n; i++) {
            if (hash.get(sum - arr[i])!=null){
                twice_count += hash.get(sum-arr[i]);
            }
            if (sum==arr[i]){
                twice_count--;
            }
        }
        return twice_count/2;
    }
}