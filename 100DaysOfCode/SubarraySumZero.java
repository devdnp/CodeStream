public class SubarraySumZero {
    boolean subArraySum(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];

            if (currentSum == 0) {
                return true;
            }
            else {
                for (int j = i + 1; j < arr.length; j++) {
                    currentSum += arr[j];

                    if (currentSum == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        SubarraySumZero arraysum = new SubarraySumZero();
        int arr[] = {4, 2, 0, 1, 6};// 4, 2, -3, 1, 6 };
        System.out.println(arraysum.subArraySum(arr));
    }
}

