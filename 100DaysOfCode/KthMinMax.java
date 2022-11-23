import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,6,3,9,8,11,58,26};
        int k = 3;
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = getMax(arr, k);
        int min = getMin(arr, k);
        System.out.println(max);
        System.out.println(min);
    }
    public static int getMax(int[] arr, int k){
        return arr[arr.length-k];
    }
    public static int getMin(int[] arr, int k){
        return arr[k-1];
    }
}
