public class MinimumJumpOne {
    public static void main(String[] args) {
        //int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int count =0;

        for (int i = 0; i < arr.length;) {
            if (arr[0]==0) {
                count = 0;
                return;
            }
            // if(i>arr.length){
            //     return;
            // }
            
                i=i+arr[i]-1;
                count++;
            
        }
        System.out.println(count);
    }
}
