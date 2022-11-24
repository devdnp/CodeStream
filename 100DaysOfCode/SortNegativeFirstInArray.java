public class SortNegativeFirstInArray {
    public static void main(String[] args) {
        int arr[] = {3,2,-5,1,-8,-4,7,-3,25,-86,0,11,-33};
        int j=0, temp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
