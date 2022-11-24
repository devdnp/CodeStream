public class ReverseArrayTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int start =0;
        int end = arr.length-1;
        reverseArr(arr, start, end);
        printArr(arr, arr.length);
    }
    public static void reverseArr(int[] arr, int start, int end){
        int temp = 0;
        if(start>=end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr, start+1, end-1);
    }
    static void printArr(int[] arr, int length){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
