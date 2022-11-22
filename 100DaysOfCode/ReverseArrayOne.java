public class ReverseArrayOne{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int s = 0;
        int e = arr.length-1;
        reverseArrayOne(arr, s, e);
        printArr(arr, arr.length);
    }

    public static void reverseArrayOne(int[] arr, int start,  int end){
        int temp =0;
        while (start<=end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArr(int[] arr, int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}