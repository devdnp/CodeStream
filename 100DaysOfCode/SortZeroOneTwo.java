public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,1,2,0,0,0,1,2,0};
        int low =0;
        int mid =0;
        int high =arr.length-1;
        int temp =0;
        while (mid<=high) {
            switch (arr[mid]) {
                case 0:{
                    temp = arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
                default:{
                    System.out.println("Something's wrong");
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
