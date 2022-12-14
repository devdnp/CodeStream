import java.util.Arrays;

public class InsertionTwoSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 28, 14};
        int[] arr2 = {2, 4, 6, 8, 9, 15, 12};
        int[] arr3 = new int[arr1.length+arr2.length];
        mergeArrays(arr1, arr2, arr3);

        System.out.println(Arrays.toString(arr3));
    }

    static void mergeArrays(int[] arr1, int[] arr2, int[] arr3){

        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }

        for (int i = 1; i < arr3.length; ++i) {
            int key = arr3[i];
            int j = i - 1;

            while (j >= 0 && arr3[j] > key) {
                arr3[j + 1] = arr3[j];
                j = j - 1;
            }
            arr3[j + 1] = key;
        }
    }
}
