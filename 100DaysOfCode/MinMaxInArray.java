public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {9,5,1,3,7,4,0,1,2,6,8,0};
        int len = arr.length;
        if(len==0)
            return;
        findMinMax(arr, len);
    }
    public static void findMinMax(int[] arr, int l){
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
    }
}
