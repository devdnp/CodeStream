public class LargestSum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = 0;
        
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
            if(sum>maxSum){
                maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
