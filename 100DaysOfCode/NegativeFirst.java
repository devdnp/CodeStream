import java.util.Arrays;

public class NegativeFirst {
    public static void main(String[] args) {
        int arr[] = {3,2,-5,1,-8,-4,7,-3,25,-86,0,11,-33};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
